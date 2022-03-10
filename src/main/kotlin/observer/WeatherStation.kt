package observer

object WeatherStation {
    @JvmStatic
    fun main(args: Array<String>) {
        val weatherData = WeatherData()

        val currentDisplay = CurrentConditionDisplay(weatherData)
        val heatIndexDisplay = HeatIndexDisplay(weatherData)

        weatherData.setMeasurements(80f, 65f, 30.4f)
        weatherData.setMeasurements(82f, 70f, 29.2f)
        weatherData.setMeasurements(78f, 90f, 29.2f)
    }
}