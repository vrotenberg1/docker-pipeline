pipeline {
  agent none
  stages {
     stage('Build Docker') {
            steps {
              step{
              def customImage = docker.build("my-image:${env.BUILD_ID}")
              }
            }
        }
  }
}
