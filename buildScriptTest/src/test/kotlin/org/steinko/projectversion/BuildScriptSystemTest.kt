package org.steinko.projectversion

import assertk.assertThat
import assertk.assertions.contains
import java.io.File
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object BuildScriptSystemTest : Spek({
    Feature("Build Script System Test") {
        Scenario("Test Properties") {

            var result: BuildResult = GradleRunner.create()
                .withProjectDir(File(ProjectDir.path()))
                .withArguments("properties")
                .build()

                Then("should test build script") {
                    assertThat(result.getOutput()).contains("BUILD SUCCESSFUL")
                }

                Then("should contain a property myProp with value myValue ") {
                    assertThat(result.getOutput()).contains("myProp: myValue")
                }

                Then("should contain a property someOtherPrpo with value 123") {
                    assertThat(result.getOutput()).contains("someOtherProp: 123")
                }

                Then("should contain Version: 0.1-SNAPSHOT") {
                    assertThat(result.getOutput()).contains("version: 0.1-SNAPSHOT")
                }
        }
        }
})
