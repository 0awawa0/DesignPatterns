package command

class RemoteControl {

    private val onCommands = Array<Command>(7) { NoCommand }
    private val offCommands = Array<Command>(7) { NoCommand }
    private var undoCommand: Command = NoCommand

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }
    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() { undoCommand.undo() }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("\n----- Remote Control -----\n")
        for (i in onCommands.indices) {
            stringBuilder.append("[slot $i] ${onCommands[i].javaClass.name} \t ${onCommands[i].javaClass.name}\n")
        }
        return stringBuilder.toString()
    }
}