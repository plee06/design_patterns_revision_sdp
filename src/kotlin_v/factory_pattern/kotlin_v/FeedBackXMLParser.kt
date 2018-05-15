package kotlin_v.factory_pattern.kotlin_v

/**
 * Concrete Product type of FeedBackXMLParser
 *
 * This is to be returned to a client through the Factory method
 *
 *
 * */
class FeedBackXMLParser : XMLParser {

    override fun parse() = "Parsing from Feed Back XML Parser"
}