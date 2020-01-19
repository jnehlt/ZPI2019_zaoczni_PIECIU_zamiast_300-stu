pipeline {
    agent { label 'android-builder' }
    triggers {
        pollSCM('') // Enabling being build on Push
    }
    stages {
        stage('check env') {
            steps {
                sh '''
                    ls -la &&
                    pwd &&
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
