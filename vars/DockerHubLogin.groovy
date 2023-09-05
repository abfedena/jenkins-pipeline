def call(String username, String password) {
    def dockerRegistry = 'docker.io' // Use the Docker Hub registry

    // Log in to Docker Hub
    sh "echo ${password} | docker login -u ${username} --password-stdin ${dockerRegistry}"
}
