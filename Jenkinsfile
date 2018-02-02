pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                if (isUnix()) {
                        sh './gradlew clean build'
                    } else {
                        bat './gradlew.bat clean build'
                    }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}