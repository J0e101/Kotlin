fun main() {
    var sh = Shape()
    sh.Draw()

    var ci = Circle()
    ci.Draw()

    var sq = Square()
    sq.Draw()

}

open class Shape{
    open fun Draw(){
        println("Drawing a shape.")
    }
}

class Circle:Shape(){
    override fun Draw(){
        println("Drawing a circle.")
    }
}

class Square:Shape(){
    override fun Draw(){
        println("Drawing a square.")
    }
}

