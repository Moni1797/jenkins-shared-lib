#!/usr/bin/env groovy

import org.company.utils.Docker

def call(String tag) {
    new Docker(this).build(tag)
}

