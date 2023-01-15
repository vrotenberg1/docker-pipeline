pipeline {
  agent any
  stages {
     stage('Build Docker') {
            steps {
              checkout scm
              script{
              customImage = docker.build("my-image:${env.BUILD_ID}")
              }
            }
        }
    stage("Test") {
      steps {
        script {
          customImage.run()
        }
      }
    }
  }
}
