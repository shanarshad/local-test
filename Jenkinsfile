pipeline {
    agent any
    stages {
        stage('Checkout code') {
            steps {
                git branch: 'develop',
                credentialsId: 'shanarshad',
                url: 'git@github.com:shanarshad/local-test.git'
            }
        }
        stage('Build') { 
            steps {
                sh './mvnw clean package' 
            }
        }
    }
}