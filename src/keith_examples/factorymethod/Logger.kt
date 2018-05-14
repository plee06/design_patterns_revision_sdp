package factorymethod

/**
 *
 * This is the Product Interface i.e. the Interface to which all Logger types are subclassed
 *
 * */
interface Logger {
    fun error(msg: String)

    fun debug(msg: String)
}