package observer

class CurrentConditionDisplay(
    private val weatherData: WeatherData
): Observer<WeatherDataValues>, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(data: WeatherDataValues) {
        this.temperature = data.temperature
        this.humidity = data.humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and $humidity% humidity")
    }
}