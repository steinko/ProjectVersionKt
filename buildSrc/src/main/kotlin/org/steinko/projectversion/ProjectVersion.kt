package org.steinko.projectversion

import org.slf4j.Logger
import org.slf4j.LoggerFactory




class ProjectVersion(val major: Int, val minor: Int) {
   
    var release: Boolean = false
    
      
    constructor(major: Int, minor: Int, aRelase: Boolean): this(major,minor)
       { 
          release = aRelase
       }
       
    

    override fun toString(): String {
        var result: String
        
        if(release) {
              result = "$major.$minor"
         }
         else {
       
               result = "$major.$minor-SNAPSHOT"
         }
         
         return result
      }
}
