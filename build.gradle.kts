plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    id("org.jmailen.kotlinter") version "2.1.1"
}
import org.steinko.projectversion.ProjectVersion

val myProp: String by extra
extra["myProp"] = "myValue"

val someOtherProp by extra(123) 

version = ProjectVersion(0,1)