pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the repository
                git 'https://github.com/saivic/JenkinsDemo.git'
            }
        }

        stage('Build') {
            steps {
                // Build the Spring Boot application using Maven
                sh 'mvn clean install'
            }
        }

        
        stage('Deploy') {
            steps {
            	sh 'start java -jar target/JenkinsDemo.jar'
            }
        }
    }
}
