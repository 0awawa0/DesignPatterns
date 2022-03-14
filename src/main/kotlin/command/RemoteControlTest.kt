package command

import command.garage_door.GarageDoor
import command.garage_door.GarageDoorOpenCommand
import command.light.Light
import command.light.LightOnCommand

object RemoteControlTest {

    @JvmStatic
    fun main(args: Array<String>) {
        val remote = SimpleRemoteControl()
        val light = Light("")
        val door = GarageDoor()
        val lightOn = LightOnCommand(light)
        val garageDoorOpen = GarageDoorOpenCommand(door)

        remote.slot = lightOn
        remote.buttonWasPressed()
        remote.slot = garageDoorOpen
        remote.buttonWasPressed()
    }
}