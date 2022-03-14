package command.ceiling_fan

import command.Command

class CeilingFanOffCommand(private val ceilingFan: CeilingFan): Command {

    override fun execute() { ceilingFan.off() }
    override fun undo() { ceilingFan.on() }
}