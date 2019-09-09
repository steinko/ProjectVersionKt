plugins {
   
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    id("org.jmailen.kotlinter") version "2.1.1"
}

repositories {
    jcenter()
}

val spek2Version = "2.0.7"

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    
     // include JUnit 5 assertions
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testImplementation ("org.spekframework.spek2:spek-dsl-jvm:$spek2Version")
    testRuntimeOnly ("org.spekframework.spek2:spek-runner-junit5:$spek2Version")

    // include JUnit 5 test engine
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.2.0") 
    
}

tasks {
    // Use the built-in JUnit support of Gradle.
    "test"(Test::class) {
        useJUnitPlatform()
    }
}
