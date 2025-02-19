plugins {
    id("java")
}

group = "ru.modula.platform"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}