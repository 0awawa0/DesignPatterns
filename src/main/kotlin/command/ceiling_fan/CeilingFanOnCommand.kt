package command.ceiling_fan

import command.Command

class CeilingFanOnCommand(private val ceilingFan: CeilingFan): Command {

    override fun execute() { ceilingFan.on() }
    override fun undo() { ceilingFan.off() }
}