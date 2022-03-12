package factory.ingredients

import factory.ingredients.cheese.Cheese
import factory.ingredients.cheese.Mozzarella
import factory.ingredients.clams.Clams
import factory.ingredients.clams.FrozenClams
import factory.ingredients.dough.Dough
import factory.ingredients.dough.ThickCrustDough
import factory.ingredients.pepperoni.Pepperoni
import factory.ingredients.pepperoni.SlicedPepperoni
import factory.ingredients.sauce.PlumTomatoSauce
import factory.ingredients.sauce.Sauce
import factory.ingredients.veggies.BlackOlives
import factory.ingredients.veggies.EggPlant
import factory.ingredients.veggies.Spinach
import factory.ingredients.veggies.Veggies

class ChicagoIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createCheese(): Cheese {
        return Mozzarella()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(BlackOlives(), Spinach(), EggPlant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }

}