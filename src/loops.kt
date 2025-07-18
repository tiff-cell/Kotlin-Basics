fun main() {

    //While loop

    var count = 45
    while (count<= 50){
        println("Number is $count")
        count++
    }

    var num =10
    while (num>=5){
        println(num)
        num--

    }
    //Do...While loop

    var x = 1
    do {
        println("Number is $x")
        x++
    }
        while (x<=5)

        //For loop..

        for (num in 30..40){
            println("Number is $num")

        }
        for (letter in 'a'..'d' ){
            println("letter is $letter")
        }

// Break and Continue
    var l= 1
    while (l <= 10) {
        if (l == 5) {
            println("Skipping number: $l")
            l++
            continue
        }

        if (l == 8) {
            println("Breaking at number: $l")
            break
        }

        println("Current number: $l")
        l++
    }
    







}