pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        stage('Maven Compile') {
            steps {
                echo 'Running mvn compile...'
                bat 'mvn compile'
            }
        }

        stage('Maven Test') {
            steps {
                echo 'Running mvn test...'
                bat 'mvn clean test'
            }
        }

        stage('Maven Package') {
            steps {
                echo 'Running mvn package...'
                bat 'mvn clean package'
            }
        }
  stage('Build Docker Image') {
            steps {
                script {
                    bat "docker build -t demo-service ."
                }
            }
        }
       
    }
}
