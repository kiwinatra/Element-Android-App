fun testLayouts() {
    val devices = mapOf(
        "Pixel 6" to ScreenConfig(1440, 3120, 560),
        "Galaxy Tab" to ScreenConfig(1600, 2560, 320)
    )

    devices.forEach { (name, config) ->
        println("Testing on $name (${config.width}x${config.height})")
        // Автоматическая проверка layout-файлов
    }
}

data class ScreenConfig(val width: Int, val height: Int, val dpi: Int)