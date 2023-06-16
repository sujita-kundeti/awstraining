pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages {
        stage("clean") {
        steps{
               sh 'mvn clean'
        }
        }
        stage("compile") {
        steps{
              sh 'mvn compile'
        }
        }
        stage("install"){
        steps{
            sh 'mvn install'
        }
        }
    }
    post{
    always{
       // Archive build artifacts
            archiveArtifacts 'target/*.jar' // Specify the file pattern for artifacts to be archived
    }
    }
}