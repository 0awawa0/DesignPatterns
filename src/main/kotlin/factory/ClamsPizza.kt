package factory

import factory.ingredients.PizzaIngredientFactory

class ClamsPizza(val ingredientFactory: PizzaIngredientFactory): Pizza() {
    override val name: String
        get() = "ClamPizza"

    override fun prepare() {
        this.dough = ingredientFactory.createDough()
        this.sauce = ingredientFactory.createSauce()
        this.cheese = ingredientFactory.createCheese()
        this.clam = ingredientFactory.createClam()
    }
}