import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

abstract class HelloTask : DefaultTask() {
    @get:Input
    abstract val userName: Property<String>

    @TaskAction
    fun hello() {
        println("Hello ${userName.get()}!")
    }
}

plugins {
    id("java-common")
    application
}

dependencies {
    implementation(project(":service"))
}

tasks.register<HelloTask>("hello") {
    userName.set("Naoki")
}
