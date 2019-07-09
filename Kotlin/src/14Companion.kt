fun main() {

    val door = Door.create()
}

class Door {
    companion object {
        fun create2(): Door = Door()
        fun create(): Door = Door()
    }
}