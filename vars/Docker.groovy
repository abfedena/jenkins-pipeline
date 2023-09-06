// my-docker-kubernetes-library/vars/Docker.groovy


def buildAndPushImage() {
    // Logic to build and push Docker image
    def dockerfile = 'Dockerfile'
    def imageName = 'ab123cb/shred'
    def imageTag = 'v1.0'
    sh "docker build -t ${imageName}:${imageTag} -f ${dockerfile} ."
    sh "docker push ${imageName}:${imageTag}"
} 
