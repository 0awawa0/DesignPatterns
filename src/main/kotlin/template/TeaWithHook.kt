package template

class TeaWithHook: CaffeineBeverage() {

    override fun brew() { println("Steeping the tea") }
    override fun addCondiments() { println("Adding lemon") }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }

    private fun getUserInput(): String {
        print("Would you like lemon your tea (y/n)? ")
        return readLine() ?: "no"
    }
}