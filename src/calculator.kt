import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the first operand: ")
    var x = read.nextInt()

    println("Enter the second operand: ")
    var y = read.nextInt()

    println("Enter operation('+', '-', '*', '/'): ")
    var z = read.next()

    var ans = when(z){
        "+" -> x + y
        "-" -> x * y
        "/" -> x / y
        else -> "Enter operator as stipulated in the example in the prompt message."
    }
    println("The final answer is $ans!!!")

}













