pipeline {
    agent { label 'master' }
    triggers {
        pollSCM('') // Enabling being build on Push
    }
    stages {
        stage('prepare env') {
            steps {
                sh '''
                    gradle -version
                '''
            }
        }
    }
}
