pipeline {
     agent {
        docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli' }
    }
     stages {
        stage('Test') {
            steps {
                sh 'docker run -dit  --name fastr-cli portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli'
            }
        }
    
}

}
