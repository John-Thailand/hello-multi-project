import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class HelloTask : DefaultTask() {
    @TaskAction
    fun hello() {
        println("Hello Gradle!")
    }
}

plugins {
    id("java-common")
    application
}

dependencies {
    implementation(project(":service"))
}

tasks.register<HelloTask>("hello")
