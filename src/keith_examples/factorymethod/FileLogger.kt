package factorymethod

import java.io.FileOutputStream
import java.io.IOException
import java.io.PrintStream

/**
 * This is another Concrete Product which gets instantiated based on the type of Logger passed in
 *
 *
 * */
class FileLogger @Throws(IOException::class)
private constructor(file: String) : Logger {
    private val out: PrintStream

    init {
        this.out = PrintStream(FileOutputStream(file), true)
    }

    override fun error(msg: String) {
        out.println("ERROR: " + msg)
    }

    override fun debug(msg: String) {
        out.println("DEBUG: " + msg)
    }
}
