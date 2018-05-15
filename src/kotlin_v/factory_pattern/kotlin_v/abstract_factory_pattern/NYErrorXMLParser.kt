package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern

/**
 *
 * Concrete Product for NY Types that are NYXMLPARSER
 *
 * */

private class NYErrorXMLParser : XMLParser {

    init {
        println("NYErrorXMLParser successfully created")
    }


    override fun parse() = "Parsing from NY Error XML Parser"
}