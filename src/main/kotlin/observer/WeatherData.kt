package observer


data class WeatherDataValues(
    val temperature: Float,
    val humidity: Float,
    val pressure: Float
)
class WeatherData: Subject<WeatherDataValues> {

    var data = WeatherDataValues(0f, 0f, 0f)
        private set

    private val observers = ArrayList<Observer<WeatherDataValues>>()

    override fun registerObserver(o: Observer<WeatherDataValues>) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer<WeatherDataValues>) {
        val index = observers.indexOf(o)
        if (index >= 0) observers.removeAt(index)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(data) }
    }

    fun measurementsChanged() { notifyObservers() }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        data = WeatherDataValues(temperature, humidity, pressure)
        measurementsChanged()
    }
}