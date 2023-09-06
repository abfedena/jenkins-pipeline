// Jenkinsfile
@Library('my-docker-kubernetes-library') _

pipeline {
    agent any
    parameters {
        string(name: 'dockerUsername', description: 'docker username')
        string(name: 'dockerPassword', description: 'docker password')
        string(name: 'dockerRegistry', description: 'docker registory')
    }
    stages {

        stage('Docker Login') {
            steps {
                    
                    DockerHubLogin(dockerUsername,dockerPassword,dockerRegistry)
                }
            }
        
    stage('Build and Push Docker Image') {
        steps {
        // Use the custom function from the Docker.groovy script
        script {
            def dockerfile = 'Dockerfile'
            def imageName = 'ab123cb/shred'
            def imageTag = 'v1.0'
            
            Docker(dockerfile, imageName, imageTag)
        }
    }
}
}
}
