pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages {
        stage("clean") {
        steps{
               sh 'mvn clean >>log.txt'
        }
        }
        stage("compile") {
        steps{
              sh 'mvn compile >>log.txt'
        }
        }
        stage("install"){
        steps{
            sh 'mvn install >>log.txt'
        }
        }
    }
    post{
    always{
       // Archive build artifacts
            archiveArtifacts 'target/*.jar'
            archiveArtifacts 'log.txt'
    }
    }
}