import org.company.utils.Docker

def call(String tag) {
    new Docker(this).push(tag)
}


