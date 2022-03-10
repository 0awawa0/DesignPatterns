package observer

interface Subject<T> {

    fun registerObserver(o: Observer<T>)
    fun removeObserver(o: Observer<T>)
    fun notifyObservers()
}