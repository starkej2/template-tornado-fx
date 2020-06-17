import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    id(Plugins.kotlinJvm) version Plugins.Versions.kotlin
    id(Plugins.javaFx) version Plugins.Versions.javaFx
}

repositories {
    jcenter()
    maven { setUrl("https://plugins.gradle.org/m2/") }
}

dependencies {
    compileClasspath(Dependencies.javaFx)
    compileClasspath(Dependencies.kotlinGradlePlugin)

    compile(Dependencies.kotlinStdLib)
    compile(Dependencies.tornadoFx)
    compile(Dependencies.kotlinReflect)

    testCompile(Dependencies.junit)
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = Dependencies.Versions.jvmTarget
    }
}

javafx {
    version = Dependencies.Versions.javaFx
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClassName = "me.jeffreystarke.template.app.MyApp"
}