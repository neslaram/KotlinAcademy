fun main() {

    printNumbers(1)
    val sumNumbers = sumNumbers(1, 2)
    foo()
    foo("Override default value")
    reformat(flag = false, number = 2, number2 = 10.0, str = "String")
    reformat(flag = false, number = 2, str = "String")
}

//function to print numbers
fun printNumbers(x: Int): Unit {
    println(x)
}

//function that returns an integer
fun sumNumbers(x: Int, y: Int): Int {
    return x + y
}

//function with default values
fun foo(name: String = "default value") {
    println(name)
}

//function with named arguments
fun reformat(str: String, flag: Boolean, number: Int, number2: Double = 9.0) {
    println(str)
    if (flag) {
        sumNumbers(number, number2.toInt())
    }
}

//single-expression functions
fun double(x: Int): Int = x * 2

fun triple(x: Int) = x * 3