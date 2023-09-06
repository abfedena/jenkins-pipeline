// my-docker-kubernetes-library/vars/Docker.groovy


def buildAndPushImage(String dockerfile, String imageName, String imageTag) {
    sh "docker build -t ${imageName}:${imageTag} -f ${dockerfile} ."
    sh "docker push ${imageName}:${imageTag}"
} 
