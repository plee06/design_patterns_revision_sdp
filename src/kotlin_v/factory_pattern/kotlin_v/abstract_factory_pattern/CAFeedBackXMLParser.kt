package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern



/**
 * CA FeedBack XML Parser Concrete Product of XMLParser
 *
 * */

private class CAFeedBackXMLParser : XMLParser {

    init {
        println("CAFeedBackXMLParser successfully created.")
    }

    override fun parse() = "Parsing CA Feed Back XML Parser"
}