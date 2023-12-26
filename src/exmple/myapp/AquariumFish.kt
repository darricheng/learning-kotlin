package exmple.myapp

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}
object SomeColor: FishColor {
    override val color = "blue"
}

class Shark: FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}
class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat algae"), FishColor by fishColor {

}

interface FishAction {
    fun eat()
}
class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}