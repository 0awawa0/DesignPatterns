package command.garage_door

import command.Command

class GarageDoorDownCommand(private val garageDoor: GarageDoor): Command {

    override fun execute() { garageDoor.down() }
    override fun undo() { garageDoor.up() }
}