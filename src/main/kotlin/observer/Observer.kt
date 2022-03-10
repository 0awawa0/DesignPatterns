package observer

interface Observer<T> {
    fun update(value: T)
}