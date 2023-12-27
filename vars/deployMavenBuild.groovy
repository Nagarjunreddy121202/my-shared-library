def call() {
    pipeline {
        agent any
 
        stages {
            stage('Checkout') {
                steps {
                    script {
                        // Your checkout logic
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
