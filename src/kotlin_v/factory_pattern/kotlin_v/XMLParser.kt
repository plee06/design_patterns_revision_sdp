package kotlin_v.factory_pattern.kotlin_v



/**
 * Product interface which declares the interface needed to be followed by all XMLParser types
 *
 *
 * */
interface XMLParser {



    /**
     * All XMLParser must implement a parse() method
     *
     *
     * */
    fun parse(): String
}
