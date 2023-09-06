// Jenkinsfile
@Library('my-docker-kubernetes-library') _

pipeline {
    agent any
    parameters {
        string(name: 'dockerUsername', description: 'docker username')
        string(name: 'dockerPassword', description: 'docker password')
        string(name: 'dockerRegistry', description: 'docker registory')
        string(name: 'dockerfile', description: 'docker username')
        string(name: 'imageName', description: 'docker password')
        string(name: 'imageTag', description: 'docker registory')
    }
    stages {

        stage('Docker Login') {
            steps {
                    
                    DockerHubLogin(dockerUsername,dockerPassword,dockerRegistry)
                }
            }
        
        stage('Build and Push Docker Image') {
            steps {
            
                    Docker(dockerfile,imageName,imageTag)
              }
             }
      }
}

