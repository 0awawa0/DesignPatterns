package command.stereo

class Stereo(private val room: String) {

    fun on() { println("$room stereo is on") }
    fun off() { println("$room stereo is off") }
    fun setCd() { println("$room stereo set CD") }
    fun setDvd() { println("$room stereo set DVD") }
    fun setRadio() { println("$room stereo set radio") }
    fun setVolume(value: Int) { println("$room stereo volume is: $value") }
}