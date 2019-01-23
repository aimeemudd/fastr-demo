pipeline {
     agent {
        docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli' }
    }
     stages {
        stage('Test') {
            steps {
                sh 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli ./fastr login --username aimeemudd --password Svvs123!'
            }
        }
    
}

}
