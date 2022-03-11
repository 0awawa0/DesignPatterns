
# DesignPatterns

The repository contains my implementations of design patterns from book "Head First Design Patterns" by Eric Freeman and Elisabeth Freeman with Kotlin.
My implementations follow the ideas from the book but might have quite different approach. 

For example, the final code for Observer pattern in the book uses Java `Observable` class. However, it is now deprecated, and also this approach has disadvantages that are described in the book itself. 

There is a different implementation in the book, which uses custom `Observer` and `Subject` classes:

```Kotlin
interface Subject {
  fun registerObserver(o: Observer)
  fun removeObserver(o: Observer)
  fun notifyObservers()
}

interface Observer {
  fun update(temperature: Float, humidity: Float, pressure: Float)
}
```

But as it is pointed out in the book, this approach lacks encapsulation. `Observer.update()` directly receives state. If the state will change (for example, if we needed
to add wind speed to it or remove humidity, or change `Float` to `Double` etc.), we will have to change the `Observer` interface itself and every class that implements the `Observer`.
There is a hint about how to address this issue in the book (we could pass the `Subject` itself into `Observer.update` function and the concrete implementation of `Observer` would 
harvest the `Subject` concrete implementation's  state itself). However, I prefer another approach, so I added generic type to `Subject` and `Observer`:

```Kotlin
interface Subject<T> {
  fun registerObserver(o: Observer<T>)
  fun removeObserver(o: Observer<T>)
  fun notifyObserver()
}

interface Observer<T> {
  fun update(data: T)
}
```

I added data class `WeatherDataValues` which encapsulates `temperature`, `humidity` and `pressure` and made `WeatherData` to implement `Subject<WeatherDataValues` and displays to implement `Observer<WeatherDataValues>`:

```Kotlin
data class WeatherDataValues(
    val temperature: Float,
    val humidity: Float,
    val pressure: Float
)

class WeatherData: Subject<WeatherDataValues> {

    var data = WeatherDataValues(0f, 0f, 0f)
        private set

    private val observers = ArrayList<Observer<WeatherDataValues>>()

    override fun registerObserver(o: Observer<WeatherDataValues>) { observers.add(o) }

    override fun removeObserver(o: Observer<WeatherDataValues>) {
        val index = observers.indexOf(o)
        if (index >= 0) observers.removeAt(index)
    }

    override fun notifyObservers() { observers.forEach { it.update(data) } }

    fun measurementsChanged() { notifyObservers() }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        data = WeatherDataValues(temperature, humidity, pressure)
        measurementsChanged()
    }
}

class CurrentConditionDisplay(
    private val weatherData: WeatherData
): Observer<WeatherDataValues>, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f

    init { weatherData.registerObserver(this) }

    override fun update(data: WeatherDataValues) {
        this.temperature = data.temperature
        this.humidity = data.humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and $humidity% humidity")
    }
}
```

Now, if we want to add some new value to weather data, say `windSpeed`. We only need to modify `WeatherDataValues` class and `WeatherData.setMeasurements` function:

```Kotlin
data class WeatherDataValues(
    val temperature: Float,
    val humidity: Float,
    val pressure: Float,
    val windSpeed: Float
)

fun setMeasurements(temperature: Float, humidity: Float, pressure: Float, windSpeed: Float) {
  data = WeatherDataValues(temperature, humidity, pressure, windSpeed)
  measurementsChanged()
}
```

But all other existing code stays the same.
