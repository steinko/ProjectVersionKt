plugins {
   
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    id("org.jmailen.kotlinter") version "2.1.1"
    
}

repositories {
    jcenter()
    mavenCentral()
    maven {
             url =  uri( "https://maven.google.com/")
           }
  
}

val spek2Version = "2.0.7"

dependencies { 
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    
    implementation ("com.pinterest:ktlint:0.34.2")
    
    testImplementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testImplementation ("org.spekframework.spek2:spek-dsl-jvm:$spek2Version")
    testRuntimeOnly ("org.spekframework.spek2:spek-runner-junit5:$spek2Version")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.2.0") 
     
   implementation ("org.slf4j:slf4j-api:2.0.0-alpha0")
   implementation ("ch.qos.logback:logback-classic:1.3.0-alpha4")
   implementation ("ch.qos.logback:logback-core:1.3.0-alpha4")
   
   testImplementation ("org.slf4j:slf4j-api:2.0.0-alpha0")
   testImplementation ("ch.qos.logback:logback-classic:1.3.0-alpha4")
   testImplementation ("ch.qos.logback:logback-core:1.3.0-alpha4")
   
   implementation (gradleApi())
   
}

tasks {
    // Use the built-in JUnit support of Gradle.
    "test"(Test::class) {
        useJUnitPlatform()
    }
}
