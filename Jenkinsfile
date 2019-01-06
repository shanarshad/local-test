pipeline {
  agent any
  stages {
    stage('Checkout Code') {
      steps {
        git(url: 'git@github.com:shanarshad/local-test.git', branch: 'develop', credentialsId: 'shanarshad', changelog: true)
      }
    }
    stage('Build') {
      steps {
        sh '''pwd
ls -l
./mvnw clean package'''
      }
    }
  }
}