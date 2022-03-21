package state

object GumballMachineTestDrive {

    @JvmStatic
    fun main(args: Array<String>) {
        val gumballMachine = GumballMachine(5)
        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)
    }
}