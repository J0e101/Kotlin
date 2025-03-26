import java.util.Scanner

fun main() {
    var read =Scanner(System.`in`)

    var doctor1 = Person()
    println(doctor1.name)
    doctor1.speak()


}
class Person{
    var name = "Jane"
    var age = 34
    var department = "Department 1"

    fun speak(){
        println("Doctor is speaking.")
    }

}

