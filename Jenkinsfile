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
                    if [ -d ./.gradle ]; then sudo rm -rf ./.gradle; fi
                '''
            }
        }
        stage('build project') {
            steps {
                sh '''
                    docker run --rm -v "$(pwd)":/workdir -w /workdir --cpus="0.4" --memory="500m" thyrlian/android-sdk ./gradlew clean build -Dkotlin.compiler.execution.strategy=in-process -Dkotlin.incremental=false
                '''
            }
        }
    }
}
