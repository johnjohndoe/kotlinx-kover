plugins {
    kotlin("jvm") version "1.7.10"
    id("org.jetbrains.kotlinx.kover") version "0.7.0-Alpha"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}