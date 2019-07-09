fun main() {


    val person = Person("Kotlin", "JetBrains")
//    println(person.firstName)
    println(person.lastName)

    Client("12", 2)

}

class Person constructor(firstName: String, val lastName: String) {
    var age: Int = 0
    val ageInDogYears: Int
        get() = age * 7

    init {
        println("Init block")
    }

}

class Customer(val firstName: String, val lastName: String, var age: Int)

class Client constructor(val name: String) {
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}


abstract class Base(val sides: Int)

class Square(private val dimension: Int) : Base(4) {
    fun getPerimeter() = dimension * sides
}