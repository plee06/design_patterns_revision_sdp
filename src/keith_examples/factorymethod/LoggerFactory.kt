package factorymethod


/**
 *
 * This is our abstract Creator class which holds the factory method
 *
 * */
abstract class LoggerFactory {

    abstract val logger: Logger

    companion object {
        @Throws(Exception::class)
        fun getFactory(f: String): LoggerFactory {
            return Class.forName(f).getConstructor().newInstance() as LoggerFactory
        }
    }
}
