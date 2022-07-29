plugins {
    kotlin("jvm")
    application
    id("org.openjfx.javafxplugin")
}


repositories {
    mavenCentral()
}

dependencies {

}

javafx {
    modules("javafx.controls", "javafx.fxml", "javafx.web")
}

application {
    mainClass.set("Window")
}
