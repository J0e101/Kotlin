
import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    print("Enter day of the week's number :")
    var day = read.nextInt()

    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursay"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"

        else -> "one week has 7 days fool"

    }

    println("The $day represents... $result ")

}