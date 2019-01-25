pipeline {
     agent any
     environment {
            PORTR_TEST_PASSWORD = credentials('PORTR_TESTER_PASSWORD')
           
        }
    tools {
            maven 'maven'
        }
    stages {
     stage('Build'){
         steps {
         sh 'mvn clean install org.jacoco:jacoco-maven-plugin:prepare-agent test package'
        }
      }
     stage(deploy) {
         agent {
                docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli:v1' }
            }
         steps {
                         sh "chmod +x -R ${env.WORKSPACE}/../${env.JOB_NAME}@pushfunction"
                         sh "${env.WORKSPACE}/../${env.JOB_NAME}@pushfunction/pushfunction.sh"
                         sh 'ls'
                         sh 'pushfunction.sh'


                     }
        }

    }

    }
