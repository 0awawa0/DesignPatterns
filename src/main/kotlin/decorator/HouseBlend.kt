package decorator

class HouseBlend(size: Size = Size.Medium): Beverage(size) {

    override val description: String
        get() = "$size House Blend Coffee"

    override val cost: Double
        get() = when (size) {
            Size.Small -> 0.69
            Size.Medium -> 0.89
            Size.Large -> 1.19
        }
}