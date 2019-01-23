pipeline {
     agent {
        docker { 
        image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli' 
        args '-dit'
        sh 'pwd'     
               }
     }
     stages {
        stage('Test') {
            steps {
                sh 'pwd'
            }
        }
    
}

}
