pipeline {
    agent { label 'android-builder' }
    triggers {
        pollSCM('')
    }
    stages {
        stage ('prepare environment') {
            steps {
                sh '''
                    echo "Downloading docker image with Android SDK"
                    docker pull thyrlian/android-sdk
                    echo "Marking gradlew as executable"
                    chmod +x $(find -type f -name "gradlew")
                '''
            }
        }
        stage('build project') {
            steps {
                sh '''
                    docker run --rm -v "$(pwd)":/workdir -w /workdir --cpus="0.75" thyrlian/android-sdk ./gradlew build
                '''
            }
        }
    }
    post { 
        always { 
            cleanWs()
        }
    }
}
