package command

object NoCommand: Command {
    override fun execute() { }
    override fun undo() { }
}