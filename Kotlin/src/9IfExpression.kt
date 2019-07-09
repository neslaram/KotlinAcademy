fun main() {

    val a = 1
    val b = 2

    if (a > b) {
        print("Choose a")
    } else {
        print("Choose b")
    }

    //if can return a value
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

    //if in one line
    val max2 = if (a > b) a else b
}