fun main() {
    val number: Any = 21
    if (number is Int) {
        println("This is a number")
    }

    if (number !is Double) {
        println("This is not a double")
    }

    //smart cast
    if (number is Int) {
        val dec = (number as Int).dec()
        println("$number minus 1 is $dec")
    }
}