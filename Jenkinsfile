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
                sh 'mvn clean package'
            }
        }

        
        stage('Deploy') {
            steps {
                // Stop any running instance of the application (optional)
		        sh 'kill $(lsof -t -i:8086)'
		
		        // Start the Spring Boot application
		        sh 'java -jar target/JenkinsDemo.jar &'
		
		        // Wait for the application to start
		        sh 'sleep 10'
		
		        // Stop the application after the tests (optional)
		        sh 'kill $(lsof -t -i:8086)'
            }
        }
    }
}
