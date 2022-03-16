package template

class CoffeeWithHook: CaffeineBeverage() {

    override fun brew() { println("Dripping Coffee through filter") }
    override fun addCondiments() { println("Adding Sugar and Milk") }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }

    private fun getUserInput(): String {
        print("Would you like milk and sugar with your coffee (y/n)? ")
        return readLine() ?: "no"
    }
}