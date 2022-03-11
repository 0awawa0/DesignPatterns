package decorator

abstract class CondimentDecorator: Beverage() {
    abstract override val description: String
}