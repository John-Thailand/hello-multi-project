import org.example.HelloTask

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
