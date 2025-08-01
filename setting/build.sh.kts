// buildss


plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.compose") version "1.5.0"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.cef:cef-bundle:91.1.21") // CEF для WebView
    implementation("io.ktor:ktor-server-netty:2.3.3")      // Ktor для сервера
}