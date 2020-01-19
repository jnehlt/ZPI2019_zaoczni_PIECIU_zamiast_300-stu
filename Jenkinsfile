pipeline {
    agent { label 'android-builder' }
    triggers {
        pollSCM('') // Enabling being build on Push
    }
    stages {
        stage('check env') {
            steps {
                sh '''
                    sdk current &&
                    gradle -v
                '''
            }
        }
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
