package state

import kotlin.random.Random

class HasQuarterState(val gumballMachine: GumballMachine): State {

    private val randomWinner = Random(System.currentTimeMillis())
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = randomWinner.nextInt(10)
        if (winner == 0 && gumballMachine.count > 1) gumballMachine.state = gumballMachine.winnerState
        else gumballMachine.state = gumballMachine.soldState
        gumballMachine.state.dispense()
    }

    override fun dispense() {
        println("No gumball dispensed")
    }
}