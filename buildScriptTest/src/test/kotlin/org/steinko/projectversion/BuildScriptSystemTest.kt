package org.steinko.projectversion

import org.junit.jupiter.api.Assertions.assertEquals

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.BuildResult

import org.junit.jupiter.api.Assertions.assertTrue

import java.io.File


object BuildScriptSystemTest : Spek({ 
    Feature("Build Script System Test")  { 
       Scenario("Test Properties") {
             
         var result: BuildResult = GradleRunner.create()
		    .withProjectDir(File(ProjectDir.path()))
		    .withArguments("properties")
		    .build()	
	
	      Then( "should test build script") {
		   assertTrue(result.output.contains("BUILD SUCCESSFUL"))
	      }
	
	      Then( "should contain a property myProp with value myValue ") {
		   assertTrue(result.output.contains("myProp: myValue"))
	       }
	
    	  Then( "should contain a property someOtherPrpo with value 123"){
		    assertTrue(result.output.contains("someOtherProp: 123"))	
	       }
	
	    }
	 }
})