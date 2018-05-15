package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern

/**
 * FeedBackXMLParser specific to NY
 * Another Concrete Product of XML Parser for NY
 *
 * */

private class NYFeedBackXMLParser : XMLParser {

    init {
        println("NYFeedBackXMLParser successfully created")
    }


    override fun parse() = "Parsing from NY Feed Back XML Parser"

}