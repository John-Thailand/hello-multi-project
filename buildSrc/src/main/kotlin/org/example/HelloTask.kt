package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class HelloTask : DefaultTask() {
    @get:Input
    abstract val userName: Property<String>

    @TaskAction
    fun hello() {
        println("Hello ${userName.get()}!")
    }
}
