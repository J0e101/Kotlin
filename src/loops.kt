import java.util.Scanner;

fun main() {
    //While loop
    var read = Scanner(System.`in`)

    println("Enter number to be appreciated: ")
    var number = read.nextInt()

    while (number <= 25){
        println("Number is $number ")
        number ++
    }

    println("Enter number to be depreciated: ")
    var assign = read.nextInt()

    while (assign >= 1){
        println("Number is $assign")
        assign --

    }

    //Do While loop
    println("Whats the number???")
    var count = read.nextInt()

    do {
        println("Number is $count")
        count ++

    }
        while ( count <= 110)

    //For loop
    println("Choose number alleady: ")
    var x = read.nextInt()

    for (x in 35 .. 45) {
        println("Number is $x")
    }

    println("Choose a letter guy")
    var y =read.next()

    for (y in 'a' .. 'd'){
        println("Letter is $y")

    }

    //Break
    println("Enter numbers between 1 and 5: ")
    var a = read.nextInt()

    for (a in 1 .. 5){
        if (a == 3) {
            break
        }
        println("Error for $a at number 3")
    }


    //Continue
    println("Enter letters between d and i: ")
    var d = read.next()

    for (d in 'd' .. 'i' ){
        if (d == 'f') {
            continue
        }
        println("Letter is $d")
    }

}
