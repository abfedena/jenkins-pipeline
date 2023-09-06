// Jenkinsfile
@Library('my-docker-kubernetes-library') _

node {
    stage('Checkout') {
        // Checkout your source code from Git
        git 'https://github.com/abfedena/node-app.git'
    }

    stage('Build and Push Docker Image') {
        // Use the custom function from the Docker.groovy script
        script {
            def dockerfile = 'Dockerfile'
            def imageName = 'ab123cb/shred'
            def imageTag = 'v1.0'
            def dockerUsername = 'ab123cb'
            def dockerRegistry = 'docker.io'
            def dockerPassword = 'Hiren@9101991'
            sh "echo ${dockerPassword} | docker login -u ${dockerUsername} --password-stdin ${dockerRegistry}"

            DockerHubLogin.call(dockerUsername,dockerPassword,dockerRegistry)
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
