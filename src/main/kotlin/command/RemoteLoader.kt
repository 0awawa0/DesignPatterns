package command

import command.ceiling_fan.CeilingFan
import command.ceiling_fan.CeilingFanOffCommand
import command.ceiling_fan.CeilingFanOnCommand
import command.garage_door.GarageDoor
import command.garage_door.GarageDoorDownCommand
import command.garage_door.GarageDoorUpCommand
import command.light.Light
import command.light.LightOffCommand
import command.light.LightOnCommand
import command.stereo.Stereo
import command.stereo.StereoOffCommand
import command.stereo.StereoOnWithCDCommand

object RemoteLoader {
    @JvmStatic
    fun main(args: Array<String>) {
        val control = RemoteControl()

        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val ceilingFan = CeilingFan("Living Room")
        val garageDoor = GarageDoor()
        val stereo = Stereo("Living Room")

        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)

        val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        val garageDoorUp = GarageDoorUpCommand(garageDoor)
        val garageDoorDown = GarageDoorDownCommand(garageDoor)

        val stereoOnWithCd = StereoOnWithCDCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        control.setCommand(0, livingRoomLightOn, livingRoomLightOff)
        control.setCommand(1, kitchenLightOn, kitchenLightOff)
        control.setCommand(2, ceilingFanOn, ceilingFanOff)
        control.setCommand(3, stereoOnWithCd, stereoOff)

        println(control)

        control.onButtonWasPushed(0)
        control.offButtonWasPushed(0)
        control.undoButtonWasPushed()

        control.onButtonWasPushed(1)
        control.offButtonWasPushed(1)
        control.undoButtonWasPushed()

        control.onButtonWasPushed(2)
        control.offButtonWasPushed(2)
        control.onButtonWasPushed(3)
        control.offButtonWasPushed(3)
    }
}