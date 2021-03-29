import org.foo.SampleClass


def age(int age){
    def test = new SampleClass()
    test.increaseAge(age)
}

def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

