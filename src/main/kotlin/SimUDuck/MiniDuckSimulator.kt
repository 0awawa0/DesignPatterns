package SimUDuck

object MiniDuckSimulator {
    @JvmStatic
    fun main(args: Array<String>) {
        val mallard: Duck = MallardDuck()
        mallard.performQuack()
        mallard.performFly()

        val model: Duck = ModelDuck()
        model.performFly()
        model.flyBehavior = FlyRocketPowered()
        model.performFly()
    }
}