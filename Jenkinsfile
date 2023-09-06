// Jenkinsfile
@Library('my-docker-kubernetes-library') _

pipeline {
    agent any
    
    stages {

        stage('Build') {
            steps {
                    // Call the buildStage() function from the shared library
                    helloWorld()
                }
            }
        
    }
}
