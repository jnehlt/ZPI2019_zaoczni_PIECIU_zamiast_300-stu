pipeline {
    agent { label 'master' }
    triggers {
        pollSCM('') // Enabling being build on Push
    }
    stages {
        stage('prepare env') {
            steps {
                sh '''
                    javac src/com/czterech/Main.kt -include-runtime -d program.jar
                '''
            }
        }
    }
}
