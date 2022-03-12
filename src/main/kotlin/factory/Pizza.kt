package factory

import factory.ingredients.cheese.Cheese
import factory.ingredients.clams.Clams
import factory.ingredients.dough.Dough
import factory.ingredients.pepperoni.Pepperoni
import factory.ingredients.sauce.Sauce
import factory.ingredients.veggies.Veggies

abstract class Pizza {
    abstract val name: String
    protected var dough: Dough? = null
    protected var sauce: Sauce? = null
    protected var cheese: Cheese? = null
    protected var veggies: List<Veggies>? = null
    protected var pepperoni: Pepperoni? = null
    protected var clam: Clams? = null

    abstract fun prepare()
    open fun bake() { println("Bake for 25 minutes at 350") }
    open fun cut() { println("Cutting the pizza into diagonal slices") }
    open fun box() { println("Place pizza in official PizzaStore box") }

    override fun toString(): String {
        return super.toString()
    }
}