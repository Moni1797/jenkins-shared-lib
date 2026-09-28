#!/user/bin/env groovy
import org.company.utils.Docker

def call() {
    new Docker(this).login()
}

