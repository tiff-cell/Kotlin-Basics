fun main() {

    //Standard - Library Functions/Built in Functions
    var result = Math.sqrt(81.0)
    println("The result is $result")

    var number = Math.round(67.9)
    println(number)

    school()
    divide()
    student("Ashirawi", Age = 48, "Female")
    student("Maryanne", Age = 36, "Female")
    student("Richard", Age = 30, "Male")
}

//User Defined Functions
fun school (){
    println("eMobilis")
}
fun divide (){
    var num1 = 56
    var num2 = 7
    println(num1/num2)

}
//Parameter and Argument
fun student (name : String, Age: Int, Gender: String){
    println("$name $Age $Gender")

}