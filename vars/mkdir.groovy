def call(String path_dir){
    sh "mkdir -p ${path_dir}"
    dir(path_dir) {
        sh 'pwd'
        sh 'git init'
    }
}
