import org.foo.Zot


def call(String url){
    git(
            [
                    url: "https://github.com/terekhovav88/${url}.gitTest"
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
