package decorator

abstract class Beverage(var size: Size = Size.Medium) {

    enum class Size {
        Small,
        Medium,
        Large
    }

    open val description = "$size Unknown Beverage"

    abstract val cost: Double
}