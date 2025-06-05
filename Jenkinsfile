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
                sh 'mvn compile'
            }
        }
    }
}
