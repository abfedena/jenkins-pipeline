// Jenkinsfile
@Library('my-docker-kubernetes-library') _

pipeline {
    agent any
    
    stages {

        stage('Build and Push Docker Image') {
            steps {
                    def dockerfile = 'Dockerfile'
                    def imageName = 'ab123cb/shred'
                    def imageTag = 'v1.0'
                    def dockerUsername = 'ab123cb'
                    def dockerRegistry = 'docker.io'
                    def dockerPassword = 'Hiren@9101991'
                    DockerHubLogin(dockerUsername,dockerPassword,dockerRegistry)
                }
            }
        
    }
}
