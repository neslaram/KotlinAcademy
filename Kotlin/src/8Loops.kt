fun main() {
    // we declare a list
    val collection = listOf(1, 2, 3, 4, 5)
    //Iterate list
    for (item in collection) {
        println(item)
    }

    //for loop with a range
    for (i in 1..3) {
        println("loop with Range $i")
    }

    // for loop as we used to do it in C++
    for (i in 6 downTo 0 step 2) {
        println("downTo $i")
    }
    for (i in 0 until 10 step 1) {
        println("until $i")
    }

    //    forEach
    collection.forEach {
        println("forEach $it")
    }
    //    forEachIndexed
    collection.forEachIndexed { index, i ->
        println("forEachIndexed $index $i")
    }
}