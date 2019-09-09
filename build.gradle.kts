import org.steinko.projectversion.ProjectVersion

val myProp: String by extra
extra["myProp"] = "myValue"

val someOtherProp by extra(123) 

version = ProjectVersion(0,1)