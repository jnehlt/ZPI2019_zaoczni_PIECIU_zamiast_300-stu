pipeline {
    agent { label 'master' }
    stages {
        stage('prepare env') {
            steps {
                sh '''
                    kotlinc src/com/czterech/Main.kt -include-runtime -d program.jar
                '''
            }
        }
    }
}
