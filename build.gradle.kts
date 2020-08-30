plugins {
    val kotlinVersion = "1.4.0"
    kotlin("jvm") version kotlinVersion apply false
    kotlin("js") version kotlinVersion apply false
}

subprojects {
    if (name == "efca2-back") {
        apply(plugin = "org.jetbrains.kotlin.jvm")
    }
    if (name == "efca2-front") {
        apply(plugin = "org.jetbrains.kotlin.js")
    }

    repositories {
        mavenCentral()
    }
}
