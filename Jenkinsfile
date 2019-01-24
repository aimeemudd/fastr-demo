pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install org.jacoco:jacoco-maven-plugin:prepare-agent test package'
            }
   
     agent {
        docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli' }
    }
        stage('Test') {
            steps {
                sh 'export PATH=$PATH:$GOPATH/src/cd-fastr-cli; fastr'

            }
        }
    }
}
