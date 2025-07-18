fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (isPrime(number)) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false

    // 0 and 1 are not prime numbers

    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
