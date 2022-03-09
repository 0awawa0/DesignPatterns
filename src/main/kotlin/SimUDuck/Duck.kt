package SimUDuck

abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() { flyBehavior.fly() }
    fun performQuack() { quackBehavior.quack() }
    fun swim() { println("All ducks float, even decoys!") }
}