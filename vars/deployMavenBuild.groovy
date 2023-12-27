def call() {
    pipeline {
        agent any
 
        stages {
            stage('Checkout') {
                steps {
                    script {
                        // Move 'checkout scm' to here
                        checkout scm
                    }
                }
            }
 
            stage('Build') {
                steps {
                    script {
                        // Your Maven build logic
                        sh 'mvn clean install'
                    }
                }
            }
 
            stage('Deploy') {
                steps {
                    script {
                        // Your deployment logic
                        sh 'mvn deploy'
                    }
                }
            }
        }
    }
}
