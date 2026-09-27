def call(String tag) {
    sh "docker push munibawan/demo-app:${tag}"
}


