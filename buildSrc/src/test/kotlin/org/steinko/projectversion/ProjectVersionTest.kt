package org.steinko.projectversion

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

class ProjectVersionTest : Spek({

    Feature("Project Version Test ") {

        Scenario("Should deliver projectversion") {

            var projectVersion: ProjectVersion = ProjectVersion(0, 1)

                Then("should display the version 0.1") {
                    assertEquals(projectVersion.toString(), "0.1-SNAPSHOT")
                }
        }
    }
})
