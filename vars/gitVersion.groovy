def call(String command){
    sh([
            "${command} --version"
    ])
}
