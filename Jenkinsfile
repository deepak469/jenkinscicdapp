pipeline {
    agent {
        node {
            label 'maven'
        }
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
//     post {
//         always {
//             notifyEndpoint(url: 'http://example.com/notifications', message: 'build finished', format: 'TEXT', contentType: 'application/json', payload: '{"key": "value"}')
//         }
//     }  
}
