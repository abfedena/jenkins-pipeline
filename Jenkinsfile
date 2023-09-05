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

                    // Log in to Docker registry
                    def dockerLoginCmd = "docker login -u ${dockerUsername} -p ${dockerPassword}"
                    def loginStatus = sh(script: dockerLoginCmd, returnStatus: true)
                    
                    if (loginStatus == 0) {
                        echo "Docker login successful."
                    } else {
                        error "Docker login failed."
                    }
                }
            }



    stage('Build and Push Docker Image') {
        // Use the custom function from the Docker.groovy script
        script {
            def dockerfile = 'Dockerfile'
            def imageName = 'ab123cb/shred'
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
