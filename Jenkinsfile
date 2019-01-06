pipeline {
    agent any
    stages {
        stage('Checkout code') {
            steps {
                checkout scm
            }
        }
        stage('Build') { 
            steps {
                sh './mvnw clean package' 
            }
        }
    }
}