pipeline {
     agent 
        docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli' 
        args '-dit'
               }
     stages {
        stage('Test') {
            steps {
                sh './fastr login'
            }
        }
    
}

}
