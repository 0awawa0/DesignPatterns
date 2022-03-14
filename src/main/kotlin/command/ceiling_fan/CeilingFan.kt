package command.ceiling_fan

class CeilingFan(private val room: String) {

    enum class Speed {
        Off,
        Low,
        Medium,
        High
    }

    var speed = Speed.Off
        private set

    fun high() { speed = Speed.High }
    fun medium() { speed = Speed.Medium }
    fun low() { speed = Speed.Low }
    fun on() { println("$room ceiling fan is on") }
    fun off() {
        speed = Speed.Off
        println("$room ceiling fan is off")
    }
}