pipeline {
    agent { master }
    stages {
        stage('prepare env') {
            steps {
                sh 'wget https://github.com/JetBrains/kotlin/archive/build-1.4.0-dev-775.tar.gz -O klt.tar.gz'
		sh 'tar -xvf klt.tar.gz'
		sh 'ls -la'
            }
        }
    }
}
