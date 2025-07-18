//Parent class/Super class
class Student {

    var name = "Austin"
    var gender = "Male"

    fun  walk(){
        println("walking")
    }

}

fun main() {
    var student1 =Student()
    println(student1.gender)

    student1.walk()

}