def login(String username, String password,String dockerRegistry ) {
 
    // Log in to Docker Hub
    sh "echo ${password} | docker login -u ${username} --password-stdin ${dockerRegistry}"
}
