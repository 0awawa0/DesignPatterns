package template

object BeverageTestDrive {

    @JvmStatic
    fun main(args: Array<String>) {
        val teaHook = TeaWithHook()
        val coffeeHook = CoffeeWithHook()

        println("\nMaking tea...")
        teaHook.prepareRecipe()

        println("\nMaking coffee...")
        coffeeHook.prepareRecipe()
    }
}