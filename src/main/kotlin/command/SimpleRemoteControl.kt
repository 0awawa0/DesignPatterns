package command

class SimpleRemoteControl {
    var slot: Command? = null

    fun buttonWasPressed() { slot?.execute() }
}