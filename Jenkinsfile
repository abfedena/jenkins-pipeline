// Jenkinsfile

@Library('my-docker-kubernetes-library') _  // Specify the name of your shared library

node {
    stage('Checkout') {
        // Checkout your source code from Git
        git 'https://github.com/abfedena/node-app.git'
    }

    stage('Docker Login') {
                script {
                    def dockerUsername = 'ab123cb'
                    def dockerPassword = 'Hiren@9101991'
                    def dockerRegistry = 'docker.io'
                    DockerHubLogin.call(dockerUsername, dockerPassword)
                }
            }



    stage('Build and Push Docker Image') {
        // Use the custom function from the Docker.groovy script
        script {
            def dockerfile = 'Dockerfile'
            def imageName = 'ab123cb/shred'
            def imageTag = 'v1.0'
            def dockerUsername = 'ab123cb'
            def dockerPassword = 'Hiren@9101991'

            DockerHubLogin.call(dockerUsername, dockerPassword)
            Docker.buildAndPushImage(dockerfile, imageName, imageTag)
        }
    }

    stage('Deploy to Kubernetes') {
        // Use the custom function from the Kubernetes.groovy script
        script {
            def kubeconfigPath = '/path/to/kubeconfig'
            def namespace = 'your-namespace'
            def deploymentYaml = 'deployment.yaml'
            
            Kubernetes.deployToKubernetes(kubeconfigPath, namespace, deploymentYaml)
        }
    }
}
