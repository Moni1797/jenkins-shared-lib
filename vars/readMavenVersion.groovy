def call() {
    def pom = readFile('pom.xml')
    def matcher = pom =~ '<version>(.+)</version>'
    if (!matcher) {
        error "Version not found in pom.xml"
    }
    return matcher[0][1]
}
