pipeline {
  agent none
  stages {
     stage('Build Docker') {
       checkout scm
            steps {
              script{
              def customImage = docker.build("my-image:${env.BUILD_ID}")
              }
            }
        }
  }
}
