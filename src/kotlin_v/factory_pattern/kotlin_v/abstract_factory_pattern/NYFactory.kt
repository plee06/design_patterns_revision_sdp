package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern




class NYFactory : AbstractParserFactory {


    override fun getParser(xp: String): XMLParser? {

        return when (xp) {
            "NYErrorXMLParser" -> NYErrorXMLParser()
            "NYFeedBackXMLParser" -> NYFeedBackXMLParser()
            else -> null
        }

    }

}