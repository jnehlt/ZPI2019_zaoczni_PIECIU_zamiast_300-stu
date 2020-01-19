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
                    /home/ubuntu/.sdkman/candidates/gradle/current/bin/gradle -v
                '''
            }
        }
        stage('prepare env') {
            steps {
                sh '''
                    /home/ubuntu/.sdkman/candidates/gradle/current/bin/gradle tasks --stacktrace
                '''
            }
        }
        stage('build project') {
            steps {
                sh '''
                    /home/ubuntu/.sdkman/candidates/gradle/current/bin/gradle build
                '''
            }
        }
    }
}
