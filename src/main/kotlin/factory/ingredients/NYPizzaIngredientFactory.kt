package factory.ingredients

import factory.ingredients.cheese.Cheese
import factory.ingredients.cheese.ReggianoCheese
import factory.ingredients.clams.Clams
import factory.ingredients.clams.FreshClams
import factory.ingredients.dough.Dough
import factory.ingredients.dough.ThinCrustDough
import factory.ingredients.pepperoni.Pepperoni
import factory.ingredients.pepperoni.SlicedPepperoni
import factory.ingredients.sauce.MarinaraSauce
import factory.ingredients.sauce.Sauce
import factory.ingredients.veggies.Garlic
import factory.ingredients.veggies.Onion
import factory.ingredients.veggies.Veggies

class NYPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(Garlic(), Onion())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }

}