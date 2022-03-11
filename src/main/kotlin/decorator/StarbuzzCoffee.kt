package decorator

object StarbuzzCoffee {

    @JvmStatic
    fun main(args: Array<String>) {
        val beverage = Espresso()
        println("${beverage.description} $${beverage.cost}")

        val beverage2: Beverage = DarkRoast(Beverage.Size.Large)
            .withMocha()
            .withMocha()
            .withWhip()
        println("${beverage2.description} $${beverage2.cost}")

        val beverage3: Beverage = HouseBlend()
            .withSoy()
            .withMocha()
            .withWhip()
        println("${beverage3.description} $${beverage3.cost}")
    }
}