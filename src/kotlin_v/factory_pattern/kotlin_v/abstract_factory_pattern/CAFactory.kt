package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern

/**
 *
 * Concrete Factory specific to CA Factories
 *
 * */

class CAFactory : AbstractParserFactory {


    override fun getParser(f: String): XMLParser? {

        return when (f) {
            "CAErrorXMLParser" -> CAErrorXMLParser()
            "CAFeedBackXMLParser" -> CAFeedBackXMLParser()
            else -> null
        }
    }
}