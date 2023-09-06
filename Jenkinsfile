// Jenkinsfile
@Library('my-docker-kubernetes-library') _

pipeline {
    agent any
    
    stages {

        stage('Build and Push Docker Image') {
            steps {
                    
                    DockerHubLogin(dockerUsername,dockerPassword,dockerRegistry)
                }
            }
        
    }
}
