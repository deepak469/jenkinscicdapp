pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
    post {
        always {
            notifyEndpoint(url: 'https://botworkflows.webex.com/embed/run/99602d205ec18679012986', message: "Build ${currentBuild.displayName} finished with status ${currentBuild.currentResult}", format: 'TEXT', contentType: 'application/json', payload: '{"key": "value"}')
        }
    }
}
