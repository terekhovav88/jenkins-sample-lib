import org.foo.Zot


def call(String url, String cred, String branch = "main"){
    git(
            [
                    branch: branch,
                    url: "https://github.com/terekhovav88/${url}.git",
                    credentialsId: cred

            ]
    )
}

//def age(int age){
//    def test = new Zot()
//    test.increaseAge(age)
//    println(test.name +" "+ test.age+" years old")
//}
//
//def info(message) {
//    echo "INFO: ${message}"
//}
//
//def warning(message) {
//    echo "WARNING: ${message}"
//}

//static void main(String[] args) {
//    age(10)
//}
