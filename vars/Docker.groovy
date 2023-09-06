// my-docker-kubernetes-library/vars/Docker.groovy
class MyObject {
    def buildAndPushImage() {
        // Custom logic for building and pushing an image
        println("Building and pushing an image...")
    }
}
MyObject.buildAndPushImage()

/*def buildAndPushImage(String dockerfile, String imageName, String imageTag) {
    // Logic to build and push Docker image
    sh "docker build -t ${imageName}:${imageTag} -f ${dockerfile} ."
    sh "docker push ${imageName}:${imageTag}"
} */
