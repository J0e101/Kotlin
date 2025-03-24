import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)

    println("Enter your firstname :")
    var firstname= readln()

    println("Hello there!! $firstname")

    println("Enter your age :")
    var age= read.nextInt()

    println("You is $age years old $firstname!!")

    println("Enter Weight :")
    var weight= read.nextDouble()

    println("$weight whole Tonnes $firstname?!!")

}