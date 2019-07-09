fun main() {

}

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        println(prop)
    }

    fun onSuccess()
}

class Child : MyInterface {
    override fun onSuccess() {

    }

    override val prop: Int = 29
}

class Child2(override val prop: Int) : MyInterface {
    override fun onSuccess() {

    }

}
