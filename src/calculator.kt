import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the first operand: ")
    var x = read.nextInt()

    println("Enter the second operand: ")
    var y = read.nextInt()

    println("Enter operation('add', 'subtract', 'divide', 'multiply'): ")
    var z = read.next()

    var ans = when(z){
        "add" -> println(x + y)
        "subtract" -> println(x - y)
        "multiply" -> println(x * y)
        "divide" -> println(x / y)
        else -> println("Enter operator as stipulated in the example in the prompt message.")
    }
    println("The final answer is $ans!!!")

}













