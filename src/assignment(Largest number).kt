import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Type your First Number: ")
    var uno = read.nextInt()

    println("You typed in $uno")

    println("Type your Second Number: ")
    var dos = read.nextInt()

    println("You typed in $dos")

    println("Type your Third Number")
    var tres = read.nextInt()

    println("You typed in $tres")

    if (uno > dos && uno > tres  ) {
        println("$uno is the greatest!!")
    }

    else if (dos > uno && dos > tres ) {
        println("$dos is the greatest!!")
    }

    else {
        println("$tres is the greatest!!")
    }


    var min = listOf(uno,dos,tres).min()
    println("$min is the least!!")
}