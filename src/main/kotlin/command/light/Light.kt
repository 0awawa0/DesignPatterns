package command.light

class Light(private val room: String) {

    fun on() { println("$room light is On") }
    fun off() { println("$room light is Off") }
}