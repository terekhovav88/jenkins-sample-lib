import org.foo.SampleClass


def cloneRepo(String url){
    git branch: 'main', credentialsId: 'f8413abe-394d-4162-98d5-842a7e37942d', url: "https://github.com/terekhovav88/${url}.git"
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
