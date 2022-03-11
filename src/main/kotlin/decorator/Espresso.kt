package decorator

class Espresso(size: Size = Size.Small): Beverage(size) {
    override val description: String
        get() = "$size Espresso"

    override val cost: Double
        get() = when (size) {
            Size.Small -> 1.59
            Size.Medium -> 1.99
            Size.Large -> 2.29
        }
}