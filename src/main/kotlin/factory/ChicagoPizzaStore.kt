package factory

import factory.ingredients.ChicagoIngredientFactory

class ChicagoPizzaStore: PizzaStore() {

    override fun createPizza(type: PizzaType): Pizza {
        val ingredientFactory = ChicagoIngredientFactory()
        return when (type) {
            PizzaType.Cheese -> CheesePizza(ingredientFactory)
            else -> CheesePizza(ingredientFactory)
        }
    }
}