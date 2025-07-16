import java.util.Scanner

fun main() {

     var read = Scanner(System.`in`)
    println("Enter Your Fullname:")
    var fullname = readln()
    println("Fullname: $fullname")

    println("How Old Are You(In Years?:")
    var age = read.nextInt()
    println("Age: $age")

    println("Enter Weight(In Kg:")
    var weight = read.nextDouble()
    println("Weight:$weight")


    println()

    println("Summary of your information")
    println("fullname:$fullname")
    println("Age:$age")
    println("Weight:$weight kg")
    println("---Thank You!!!!---")






}