package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern




/**
 * Concrete XMLParser Product
 *
 *
 * */

private class CAErrorXMLParser : XMLParser {

    init {
        println("CAErrorXMLParser successfully created")
    }
    override fun parse() = "Parsing from CA Error XML Parser"
}