package factory

abstract class PizzaStore {
    enum class PizzaType {
        Cheese,
        Pepperoni,
        Clam,
        Veggie
    }

    fun orderPizza(type: PizzaType): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: PizzaType): Pizza
}