#!/user/bin/env groovy

def call(String tag) {
    echo "building the docker image with tag: ${tag}"

    withCredentials([usernamePassword(
        credentialsId: 'dockerhub-repo',
        usernameVariable: 'USER',
        passwordVariable: 'PASS'
    )]) {
        sh "docker build -t munibawan/demo-app:${tag} ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push munibawan/demo-app:${tag}"
    }
}

