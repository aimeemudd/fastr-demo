#!/bin/bash

cd /go/src/cd-fastr-cli
./fastr login --username portr-tester --password $PORTR_TEST_PASSWORD
./fastr create -o test -f /var/jenkins_home/workspace/fastr-cli-demo/meta.json
./fastr create -o test -r fastrtest -n blobby -b /var/jenkins_home/workspace/fastr-cli-demo/target/test.jar