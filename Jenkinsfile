pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch:'main', url:'https://github.com/gabrielvalverde83/GlobantTutoria03-simple-pipeline-practice.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    echo "Hola Soy Gabriel"
                    sh "java src/Main.java"
                }
            }
        }

        stage('Test'){
            steps {
                sh "mvn test"
            }
        }


    }
}