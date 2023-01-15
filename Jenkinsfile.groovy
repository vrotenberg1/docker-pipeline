pipeline {
  agent any
  stages {
     stage('Build Docker') {
            steps {
              checkout scm
              script{
              def customImage = docker.build("my-image:${env.BUILD_ID}")
              }
            }
        }
  }
}
