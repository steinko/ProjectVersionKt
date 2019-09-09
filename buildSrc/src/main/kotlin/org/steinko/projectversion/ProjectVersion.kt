package org.steinko.projectversion

class ProjectVersion(val major: Int, val minor: Int) {

    override fun toString(): String {
        return "$major.$minor-SNAPSHOT"
        }
}
