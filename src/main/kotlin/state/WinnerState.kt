package state

class WinnerState(val gumballMachine: GumballMachine): State {
    override fun insertQuarter() {

    }

    override fun ejectQuarter() {

    }

    override fun turnCrank() {

    }

    override fun dispense() {
        println("YOU'RE A WINNER! You get two gumballs for your quarter")
        gumballMachine.releaseBall()
        if (gumballMachine.count == 0) gumballMachine.state = gumballMachine.soldOutState
        else {
            gumballMachine.releaseBall()
            if (gumballMachine.count > 0) gumballMachine.state = gumballMachine.noQuarterState
            else {
                println("Oops, out of gumballs!")
                gumballMachine.state = gumballMachine.soldOutState
            }
        }
    }


}