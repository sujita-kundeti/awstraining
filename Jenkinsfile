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
    }
}