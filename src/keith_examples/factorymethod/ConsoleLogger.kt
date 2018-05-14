package factorymethod;

import java.lang.System.err

/**
 * This is the Concrete Product that needs to be returned upon a Logger type
 *
 * */
class ConsoleLogger : Logger {
    override fun error(msg: String) {

        err.println("ERROR: " + msg)
    }

    override fun debug(msg: String) {

        err.println("DEBUG: " + msg)
    }
}