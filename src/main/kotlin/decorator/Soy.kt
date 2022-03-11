package decorator

class Soy(val beverage: Beverage): CondimentDecorator() {

    override val description: String
        get() = "${beverage.description}, soy"

    override val cost: Double
        get() = beverage.cost + when (beverage.size) {
            Size.Small -> 0.05
            Size.Medium -> 0.15
            Size.Large -> 0.25
        }
}

fun Beverage.withSoy(): Beverage { return Soy(this) }