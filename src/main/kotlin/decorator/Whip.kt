package decorator

class Whip(val beverage: Beverage): CondimentDecorator() {

    override val description: String
        get() = "${beverage.description}, whip"

    override val cost: Double
        get() = beverage.cost + when (beverage.size) {
            Size.Small -> 0.05
            Size.Medium -> 0.1
            Size.Large -> 0.15
        }
}

fun Beverage.withWhip(): Beverage { return Whip(this) }