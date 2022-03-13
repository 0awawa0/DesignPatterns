package singleton

class Singleton {

    companion object {
        @Volatile
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {
                synchronized(Singleton::class) {
                    if (instance == null) instance = Singleton()
                }
            }
            return instance!!
        }
    }
}