package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    expectSteps {
        maven {
            goals = "clean package"
            localRepoScope = MavenBuildStep.RepositoryScope.MAVEN_DEFAULT
            dockerImage = "maven:3.6.0-jdk-8"
        }
    }
    steps {
        update<MavenBuildStep>(0) {
            clearConditions()
            mavenVersion = auto()
            dockerImage = "maven:3.8.4"
        }
    }
}