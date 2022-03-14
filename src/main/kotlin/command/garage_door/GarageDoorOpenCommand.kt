package command.garage_door

import command.Command

class GarageDoorOpenCommand(private val door: GarageDoor): Command {

    override fun execute() { door.up() }
    override fun undo() { door.down() }
}