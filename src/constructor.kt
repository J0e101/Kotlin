fun main() {
    var dog1 = Dog("Billy", "Chihuahua", "Brown")
    println(dog1.breed)

    var dog2 = Dog("Mike", "Kienyeji", "Brown")
    println(dog2.color)

    var dog3 = Dog("Joseph", "German Shepherd", "White")
    println(dog3.name)

    var dog4 = Dog("Ian", "Siberian Husky", "Grey")
    println(dog4.name + dog4.breed + dog4.color)

}

class Dog(var name:String,var breed:String,var color:String ){

}

