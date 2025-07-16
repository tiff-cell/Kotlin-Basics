import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    print("Enter first number: ")
    var first = read.nextDouble()

    print("Enter operator (+, -, *, /): ")
    var operator = read.next()[0]

    print("Enter second number: ")
    var second = read.nextDouble()

    var result = when (operator) {
        '+' -> first + second
        '-' -> first - second
        '*' -> first * second
        '/' -> {
            if (second == 0.0) {
                println("Error: Division by zero")
                return
            }
            first / second
        }
        else -> {
            println("Error: Invalid operator")
            return
        }
    }

    println("Result: $first $operator $second = $result")
    read.close()
}





