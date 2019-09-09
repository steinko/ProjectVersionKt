plugins {
 
    kotlin("jvm") version "1.3.50"
    id("org.jmailen.kotlinter") version "2.1.1"
}

import org.steinko.projectversion.ProjectVersion

val myProp: String by extra
extra["myProp"] = "myValue"

val someOtherProp by extra(123) 

version = ProjectVersion(0,1)

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

val printVersion by tasks.registering { 
   doFirst {
		println ("Before reading the project version")
	}
	doLast {  
		println ("Version: $version")
	}
}

printVersion {
   doFirst { 
	   println ("First Action")
   }
}

printVersion {
     doLast { 
	     println ("Last Action")
	 }
}