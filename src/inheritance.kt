open class Animal{
    var hasFeathers = true
    var hasWings=false

    fun speak(){
        println("Animal is Speaking")
    }

}

//child Class
class Duck : Animal(){
    var color = "White"
    fun swim(){
        println("Duck is swimming")
    }
}

fun main(){
    var a = Animal()

    var d = Duck()
    d.speak()
    println(d.color)
}
