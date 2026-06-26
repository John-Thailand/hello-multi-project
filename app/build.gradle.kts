plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":service"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
