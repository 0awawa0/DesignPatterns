package factory

import factory.ingredients.NYPizzaIngredientFactory

class NYPizzaStore: PizzaStore() {

    override fun createPizza(type: PizzaType): Pizza {

        val ingredientFactory = NYPizzaIngredientFactory()
        return when (type) {
            PizzaType.Cheese -> CheesePizza(ingredientFactory)
            else -> CheesePizza(ingredientFactory)
        }
    }
}