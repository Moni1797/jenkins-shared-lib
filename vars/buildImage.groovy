#!/usr/bin/env groovy

def call(String tag) {
    sh "docker build -t munibawan/demo-app:${tag} ."
}

