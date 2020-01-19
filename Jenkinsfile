pipeline {
    agent { label 'master' }
    triggers {
        pollSCM('') // Enabling being build on Push
    }
    stages {
        stage('prepare env') {
            steps {
                sh '''
                    gradle tasks
                '''
            }
        }
        stage('build project') {
            steps {
                sh '''
                    gradle build
                '''
            }
        }
    }
}
