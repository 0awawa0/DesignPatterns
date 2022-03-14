package command.ceiling_fan

import command.Command

class CeilingFanHighCommand(private val ceilingFan: CeilingFan): Command {

    private var prevSpeed = CeilingFan.Speed.Off

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.high()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.Speed.High -> ceilingFan.high()
            CeilingFan.Speed.Medium -> ceilingFan.medium()
            CeilingFan.Speed.Low -> ceilingFan.low()
            CeilingFan.Speed.Off -> ceilingFan.off()
        }
    }
}