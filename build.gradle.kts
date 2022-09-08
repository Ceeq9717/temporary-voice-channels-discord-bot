import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    // KotlinX Serialization
    kotlin("plugin.serialization") version "1.7.10"
}

// Astro domain name reversed (original: https://astro-bot.space)
group = "space.astro-bot"
version = "1.0"

repositories {
    mavenCentral()
    // Jitpack needed for jda-ktx library
    maven("https://jitpack.io/")
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0-alpha.18")
    implementation("com.github.minndevelopment:jda-ktx:081a177")
    implementation("io.github.cdimascio:dotenv-kotlin:6.3.1")
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.23")
    implementation("ch.qos.logback:logback-classic:1.4.0")
    implementation("org.litote.kmongo:kmongo-serialization:4.7.0")
    implementation("com.aventrix.jnanoid:jnanoid:2.0.0")
    implementation("org.reflections:reflections:0.10.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
