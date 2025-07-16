import java.util.Scanner
fun main() {
    var number = 1

    while (number <= 10) {
        if (number % 2 == 0) {
            println("$number is Even")
        } else {
            println("$number is Odd")
        }
        number++  // increment number
    }
}
