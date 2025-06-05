pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "developer-coder/docker-jenkins"
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/developer-coder/Docker_Jenkins.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Login & Push Docker Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-token', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh '''
                        echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                        docker push $DOCKER_IMAGE
                    '''
                }
            }
        }
    }

    post {
        success {
            echo '✅ Build and Docker push successful!'
        }
        failure {
            echo '❌ Build or push failed.'
        }
    }
}
