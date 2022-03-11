package decorator

class Mocha(val beverage: Beverage): CondimentDecorator() {

    override val description: String
        get() = "${beverage.description}, mocha"

    override val cost: Double
        get() = beverage.cost + when (beverage.size) {
            Size.Small -> 0.10
            Size.Medium -> 0.20
            Size.Large -> 0.30
        }
}

fun Beverage.withMocha(): Beverage { return Mocha(this) }