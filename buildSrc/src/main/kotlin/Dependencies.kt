object Dependencies {
    object Versions {
        const val jvmTarget = "11"
        const val javaFx = "11.0.2"
        const val tornadoFx = "1.7.17"
        const val junit = "4.12"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.Versions.kotlin}"
    const val tornadoFx = "no.tornado:tornadofx:${Versions.tornadoFx}"
    const val junit = "junit:junit:${Versions.junit}"
    const val javaFx = "org.openjfx:javafx-plugin:${Plugins.Versions.javaFx}"
}

object Plugins {
    object Versions {
        const val kotlin = "1.3.72"
        const val javaFx = "0.0.8"
    }

    const val kotlinJvm = "org.jetbrains.kotlin.jvm"
    const val javaFx = "org.openjfx.javafxplugin"
}
