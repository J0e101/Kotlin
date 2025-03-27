import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    var a = Animal()
    var b = dog()
    b.makesound()
    println(b.gender)

    var c = cat()


}

//Parent Class || Super Class || Base Class
open class Animal{
    var age = 3
    var gender = "Male"

    fun makesound(){
        println("Animal is speaking.")
    }

}

//Child Classes || Derived Classes || Sub-Classes
class dog:Animal(){
    fun bark(){
        println("Dog is barking!!!")
    }
}

class cat{
    var color = "White"
    var hasFur = true

    fun meow(){
        println("Cat is meowing!!!")
    }
}


