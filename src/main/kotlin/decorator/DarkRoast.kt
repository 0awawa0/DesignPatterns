package decorator

class DarkRoast(size: Size = Size.Medium): Beverage(size) {

    override val description: String
        get() = "$size Dark Roast"

    override val cost: Double
        get() = when (size) {
            Size.Small -> 0.59
            Size.Medium -> 0.99
            Size.Large -> 1.29
        }
}