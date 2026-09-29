def call(String version) {
    script {
        sh """
        echo "Deploying version: ${version}"
        docker pull munibawan/demo-app:${version}
        docker stop demo-app || true
        docker rm demo-app || true
        docker run -d --name demo-app -p 8081:8080 munibawan/demo-app:${version}
        """
    }
}
