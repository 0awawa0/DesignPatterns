package factory

object PizzaTestDrive {
    @JvmStatic
    fun main(args: Array<String>) {
        val nyStore = NYPizzaStore()
        val chicagoStore = ChicagoPizzaStore()

        var pizza: Pizza = nyStore.orderPizza(PizzaStore.PizzaType.Cheese)
        println("Ethan ordered a ${pizza.name}\n")

        pizza = chicagoStore.orderPizza(PizzaStore.PizzaType.Cheese)
        println("Joel ordered a ${pizza.name}\n")
    }
}