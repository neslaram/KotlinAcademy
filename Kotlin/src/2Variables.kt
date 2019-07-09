//constant
const val PI = 3.1416

fun main() {

    //  Read-only local variables
    val carSpeed = 12.0f
    //  this wont compile
    //    carSpeed = 13.0f

    //  Variables that can be reassigned
    var myColorStr = "blue"
    myColorStr = "red"

    //    value type inferred
    val myCarName: String = "Tesla"
    val myCarHeight: Int = 12
    val isMyCar: Boolean = false
    val myCarPrice: Double = 240.3
    val discount: Float = 9.99f

}