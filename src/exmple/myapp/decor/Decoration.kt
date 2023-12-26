package exmple.myapp.decor

enum class Color(val rgb: Int) {
    RED(0XFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

data class Decoration(val rocks: String, val wood: String, val diver: String) {
}

fun makeDecorations() {
    val d = Decoration("slate", "oak", "diver")
    println(d)
    val (_, wood) = d
    println(wood)
    // println(w)
    // println(dv)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}