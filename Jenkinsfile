pipeline {
    agent any
    tools {
        maven 'maven'
    }
 stages {
        stage('Build') {
            steps {
                sh 'mvn build org.jacoco:jacoco-maven-plugin:prepare-agent test package'
            }
        }    
}

}
