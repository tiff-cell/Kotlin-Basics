fun main() {
    print("Enter a number to generate its multiplication table: ")
    val number = readLine()!!.toInt()

    println("Multiplication table of $number:")
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}
