import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.deleteRecursively
import org.cef.CefApp
import org.cef.CefClient
import org.cef.browser.CefBrowser
import org.cef.handler.CefLifeSpanHandlerAdapter
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.net.URI

@OptIn(ExperimentalPathApi::class)
fun main() = application {
    
    val viteAppDir = extractZipToTempDir("dev.zip")

   
    val server = startKtorServer(viteAppDir, port = 8080)


    Window(onCloseRequest = {
        server.stop()  
        Files.deleteRecursively(viteAppDir.toPath())  
        exitApplication()
    }) {
        DesktopMaterialTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                CefWebView("http://localhost:8080")
            }
        }
    }
}


@OptIn(ExperimentalPathApi::class)
fun extractZipToTempDir(zipResourcePath: String): File {
    val tempDir = Files.createTempDirectory("vite-app").toFile()
    val zipStream = object {}.javaClass.getResourceAsStream(zipResourcePath)
        ?: error("ZIP-архив не найден: $zipResourcePath")

    java.util.zip.ZipInputStream(zipStream).use { zip ->
        var entry = zip.nextEntry
        while (entry != null) {
            val file = File(tempDir, entry.name)
            if (entry.isDirectory) {
                file.mkdirs()
            } else {
                file.parentFile.mkdirs()
                file.outputStream().use { zip.copyTo(it) }
            }
            entry = zip.nextEntry
        }
    }
    return tempDir
}


fun startKtorServer(staticDir: File, port: Int): NettyApplicationEngine {
    return embeddedServer(Netty, port = port) {
        routing {
            static {
                files(staticDir)
                default(staticDir.resolve("index.html").absolutePath)
            }
        }
    }.start(wait = false)
}

/**
 * Встроенный WebView (на основе CEF).
 */
@Composable
fun CefWebView(url: String) {
    DisposableEffect(Unit) {
        // Инициализация CEF
        val cefApp = CefApp.getInstance()
        val client = cefApp.createClient()
        val browser = client.createBrowser(url, false, false)

        // Обработка закрытия
        onDispose {
            browser.close(true)
            cefApp.dispose()
        }
    }
}