import org.foo.SampleClass


def gitClone(String branch, String cred, String url){
    git branch: ${branch}, credentialsId: ${cred}, url: ${url}
}

//def age(int age){
//    def test = new SampleClass()
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
