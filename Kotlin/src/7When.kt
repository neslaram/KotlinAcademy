fun main() {
    val x = 1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

    //when expressions can return a value
    val myName = when (x) {
        1 -> "Name 1"
        2 -> "Name 2"
        else -> "Wrong Number!"
    }

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    when (x) {
        in 1..5 -> print("x is in the first range")
        in 6..10 -> print("x is in the second range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

}