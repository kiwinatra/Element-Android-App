import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/api/user") {
                call.respond("""{"id": 1, "name": "Test User"}""")
            }
        }
    }.start(wait = true)
}