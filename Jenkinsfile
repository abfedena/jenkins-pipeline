// Jenkinsfile

@Library('my-docker-kubernetes-library') _  // Specify the name of your shared library

node {
    stage('Checkout') {
        // Checkout your source code from Git
        git 'https://github.com/abfedena/node-app.git'
    }

    stage('Build and Push Docker Image') {
        // Use the custom function from the Docker.groovy script
        script {
            def dockerfile = 'Dockerfile'
            def imageName = 'nodeapp/v2'
            def imageTag = 'v1.0'
            
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
