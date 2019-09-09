package org.steinko.projectversion

import assertk.assertThat
import assertk.assertions.contains
import java.io.File
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object PrintVersionSystemTest : Spek({
    Feature("Print Vesrion Task System Test") {
        Scenario("Test Task") {
            var result: BuildResult = GradleRunner.create()
                .withProjectDir(File(ProjectDir.path()))
                .withArguments("printVersion")
                .build()

                Then("should test build script") {
                    assertThat(result.getOutput()).contains("BUILD SUCCESSFUL")
                }
                
                Then("should print Version: 0.1-SNAPSHOT") {
		             assertThat(result.getOutput()).contains("Version: 0.1-SNAPSHOT")	
	            }
	
	           Then("should print Before reading the project version") {
	       	         assertThat(result.getOutput()).contains("Before reading the project version")
	           }
	
	          Then ( "should print fisrt action" ) {
		            assertThat(result.getOutput()).contains("First Action")
	           }
	
	           Then("should print last action") {
		             assertThat(result.getOutput()).contains("Last Action")
	           }
	
          }
     }
})
