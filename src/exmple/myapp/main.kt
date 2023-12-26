package exmple.myapp

fun makeFish() {
    val shark = Shark()

    val pleco = Plecostomus(fishColor = SomeColor)
    println("${pleco.color}")

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    makeFish()
}