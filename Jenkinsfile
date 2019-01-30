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
                docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli:v4' }
            }
         steps {

                      
                         sh '/fastr login --username portr-tester --password $PORTR_TEST_PASSWORD'
                         sh '/fastr create -o test -f ${workspace}/meta.json'
                         sh '/fastr create -o test -r fastrtest -n blobby -b ${workspace}/target/test.jar'
                         sh 'cat /root/.fastr.json'

                     }
        }

    }

    }
