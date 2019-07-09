fun main() {
    //this can be null or not
    val myCar: String? = null

    //this can't be null
    val myCarBrandName: String = ""

    //elvis operator
    val myName: String? = null
    val realName = myName ?: "default value"
    println("Hi, my name is $realName")

    //  If myName is not null, it will capitalize the String,
    //  if not it will return an empty string
    val decapitalize: String = myName?.capitalize().orEmpty()

    val myAge: Any? = null
    //  if myAge is not null it will increment the value by one
    val nextYearAge = (myAge as? Int)?.inc()
    println("Next year I will be $nextYearAge")


}