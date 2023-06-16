pipeline {
    agent any
    stages {
        stage("clean") {
        steps{
                withMaven(maven: 'maven'){
               sh 'mvn clean' }
        }
        }
        stage("compile") {
        steps{
              sh 'mvn compile'
        }
        }
    }
}