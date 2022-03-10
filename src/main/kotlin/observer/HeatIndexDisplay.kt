package observer

class HeatIndexDisplay(
    private val weatherData: WeatherData
): Observer<WeatherDataValues>, DisplayElement {

    private var temperature = 0f
    private var humidity = 0f

    init { weatherData.registerObserver(this) }

    override fun update(data: WeatherDataValues) {
        this.temperature = data.temperature
        this.humidity = data.humidity
        display()
    }

    override fun display() {
        println("Heat index is: ${getHeatIndex()}")
    }

    private fun getHeatIndex(): Float {
        val t = temperature
        val tPow2 = t * t
        val tPow3 = tPow2 * t
        val h = humidity
        val hPow2 = h * h
        val hPow3 = hPow2 * h

        val heatIndex = 16.923 + 1.85212 * 0.1 * t + 5.37941 * h - 1.00254 * 0.1 * t * h + 9.41695 * 0.001 * tPow2 + 7.28898 * 0.001 * hPow2 + 3.45372 * 0.0001 * tPow2 * h - 8.14971 * 0.0001 * t * hPow2 + 1.02102 * 0.00001 * tPow2 * hPow2 - 3.8646 * 0.00001 * tPow3 + 2.91583 * 0.00001 * hPow3 + 1.42721 * 0.000001 * tPow3 * h + 1.97483 * 0.0000001 * t * hPow3 - 2.18429 * 0.00000001 * tPow3 * hPow2 + 8.43296 * 0.0000000001 * tPow2 * hPow3 - 4.81975 * 0.00000000001 * tPow3 * hPow3
        return heatIndex.toFloat()
    }
}