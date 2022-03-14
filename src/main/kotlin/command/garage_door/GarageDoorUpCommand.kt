package command.garage_door

import command.Command

class GarageDoorUpCommand(private val garageDoor: GarageDoor): Command {

    override fun execute() { garageDoor.up() }
    override fun undo() { garageDoor.down() }
}