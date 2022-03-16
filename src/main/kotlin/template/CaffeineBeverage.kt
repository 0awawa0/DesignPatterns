package template

abstract class CaffeineBeverage {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) addCondiments()
    }

    abstract fun brew()
    abstract fun addCondiments()

    fun boilWater() { println("Boiling water") }
    fun pourInCup() { println("Pouring into cup") }
    open fun customerWantsCondiments(): Boolean { return true }
}