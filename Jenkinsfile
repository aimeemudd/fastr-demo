pipeline {
    agent {
        docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'export PATH=$PATH:$GOPATH/src/cd-fastr-cli; fastr'

            }
        }
    }
}
