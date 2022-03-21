package state

class GumballMachine(var count: Int) {

    val soldOutState: State = SoldOutState(this)
    val noQuarterState: State = NoQuarterState(this)
    val hasQuarterState: State = HasQuarterState(this)
    val soldState: State = SoldState(this)
    val winnerState: State = WinnerState(this)

    var state: State = if (count > 0) noQuarterState else soldOutState

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
    }

    fun dispense() {
        state.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot")
        if (count != 0) count--
    }
    fun refill(count: Int) {
        this.count += count
        if (state == soldOutState) state = noQuarterState
        println("Gumball machine refilled, gumballs count is ${this.count}")
    }

    override fun toString(): String {
        val result = StringBuilder()
        result.append("Mighty Gumball, Inc.\n")
        result.append("Java-enabled Standing Gumball Model #2004\n")
        result.append("Inventory: $count gumballs\n")
        when (state) {
            noQuarterState -> result.append("Machine is waiting for quarter\n")
            soldOutState -> result.append("Machine is sold out\n")
            hasQuarterState -> result.append("Machine waiting for crank to be turned\n")
            soldState -> result.append("Machine is giving out a gumball\n")
        }
        return result.toString()
    }
}