package org.steinko.projectversion

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

class ProjectVersionTest : Spek({

    Feature("Project Version Test ") {
        Scenario("Should deliver projectversion") {
            var projectVersion: ProjectVersion = ProjectVersion(0, 1)

                Then("should display the version 0.1-SNAPSHOT") {
                    assertEquals(projectVersion.toString(), "0.1-SNAPSHOT")
                }

                Then("should display version 0.2-SNAPSHOT") {
                    projectVersion = ProjectVersion(0, 2)
                    assertEquals(projectVersion.toString(), "0.2-SNAPSHOT")
                }

                Then("should display the version 0.2") {
                    projectVersion = ProjectVersion(0, 2, true)
                    assertEquals(projectVersion.toString(), "0.2")
                }

                Then("should display the version 0.3 for seconary constructor") {
                    projectVersion = ProjectVersion(0, 3, false)
                    assertEquals(projectVersion.toString(), "0.3-SNAPSHOT")
                }
        }
    }
})
