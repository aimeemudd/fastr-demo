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
                docker { image 'portr.ctnr.ctl.io/fastr-cli-builder/fastr-cli:v2' }
            }
         steps {

                         sh 'pwd'
                         sh 'ls'
                         sh 'cd /go/src/cd-fastr-cli; ./fastr login --username portr-tester --password $PORTR_TEST_PASSWORD'
                         sh 'cd /go/src/cd-fastr-cli; ./fastr list'
                         sh 'cd /go/src/cd-fastr-cli; ./fastr create -o test -f /var/jenkins_home/workspace/fastr-cli-demo/meta.json'




                     }
        }

    }

    }
