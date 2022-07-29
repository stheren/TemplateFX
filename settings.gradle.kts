rootProject.name = "testJFX"
include("java")

pluginManagement {
    val kotlinVersion: String by settings
    val javafxVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion
        id("org.openjfx.javafxplugin") version javafxVersion
    }
}
