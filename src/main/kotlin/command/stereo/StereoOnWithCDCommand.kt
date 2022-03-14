package command.stereo

import command.Command

class StereoOnWithCDCommand(private val stereo: Stereo): Command {

    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(11)
    }

    override fun undo() { stereo.off() }
}