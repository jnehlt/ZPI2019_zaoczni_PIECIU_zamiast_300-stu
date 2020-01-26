pipeline {
    agent { label 'android-builder' }
    triggers {
        pollSCM('')
    }
    stages {
        stage ('prepare environment') {
            steps {
                sh '''
                    docker pull thyrlian/android-sdk
                '''
            }
        }
        stage('build project') {
            steps {
                sh '''
                    docker run --rm -v "$(pwd)":/workdir -w /workdir thyrlian/android-sdk ./gradlew
                '''
            }
        }
    }
}
