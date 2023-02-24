pipeline {
    agent any
    tools {
    maven 'mymaven'
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
//     post {
//         always {
//             notifyEndpoint(url: 'http://example.com/notifications', message: 'build finished', format: 'TEXT', contentType: 'application/json', payload: '{"key": "value"}')
//         }
//     }  
}
