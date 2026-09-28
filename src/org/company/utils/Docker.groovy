package org.company.utils

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def login() {
        script.withCredentials([script.usernamePassword(
            credentialsId: 'dockerhub-repo',
            usernameVariable: 'USER',
            passwordVariable: 'PASS'
        )]) {
            script.sh 'echo $PASS | docker login -u $USER --password-stdin'
        }
    }

    def build(String tag) {
        script.sh "docker build -t munibawan/demo-app:${tag} ."
    }

    def push(String tag) {
        script.sh "docker push munibawan/demo-app:${tag}"
    }
}

