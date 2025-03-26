import java.util.Scanner

fun main() {

    var read= Scanner(System.`in`)

    //Standard Library Functions/ Pre-Defined Functions
    var x = Math.sqrt(144.0)
    println("$x is the square root of 144")

    school()
    student("Joseph",31)
    student("Ian",11)

    println("Enter name of employee: ")
    var name = readln()

    println("Enter salary of employee: ")
    var salary = read.nextInt()

    println("Enter disability status: ")
    var disability = read.nextBoolean()

    employee(name,salary,disability)


}

//User-defined FUnctions
fun school(){
    println("eMobilis")
}

//Parameter/Variable and Argument/Value
fun student(name:String, age:Int){
    println("$name is $age years old.")
}

//Assignment
fun employee(name:String, salary:Int, disability: Boolean){
    println("$name earns Ksh $salary amd their disability status is $disability")
}

