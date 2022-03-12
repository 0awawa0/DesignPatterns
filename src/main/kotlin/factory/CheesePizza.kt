package factory

import factory.ingredients.PizzaIngredientFactory

class CheesePizza(val ingredientFactory: PizzaIngredientFactory): Pizza() {

    override val name: String
        get() = "CheesePizza"

    override fun prepare() {
        this.dough = ingredientFactory.createDough()
        this.sauce = ingredientFactory.createSauce()
        this.cheese = ingredientFactory.createCheese()
    }
}