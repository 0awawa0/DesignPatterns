package factory.ingredients

import factory.ingredients.cheese.Cheese
import factory.ingredients.clams.Clams
import factory.ingredients.dough.Dough
import factory.ingredients.pepperoni.Pepperoni
import factory.ingredients.sauce.Sauce
import factory.ingredients.veggies.Veggies

interface PizzaIngredientFactory {
    fun createDough(): Dough

    fun createCheese(): Cheese
    fun createSauce(): Sauce
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}