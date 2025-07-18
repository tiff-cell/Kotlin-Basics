fun main() {
    print("Enter a year: ")
    val year = readLine()!!.toInt()

    if (isLeapYear(year)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
