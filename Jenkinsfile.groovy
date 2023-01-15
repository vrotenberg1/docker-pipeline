pipeline {
  agent none
  stages {
     stage('Build Docker') {
            steps {
              script{
              def customImage = docker.build("my-image:${env.BUILD_ID}")
              }
            }
        }
  }
}
