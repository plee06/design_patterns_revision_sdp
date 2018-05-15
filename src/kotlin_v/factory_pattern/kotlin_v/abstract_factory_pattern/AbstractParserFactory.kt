package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern


/**
 * interface for the Abstract Parser Factory which produces the corresponding Factory
 * according to Client needs, those Factories that are returned then return the specific type of Parser
 * that the Client wants.
 *
 * Ex. ParserFactory.getFactory("NY) -> returns NYFactory which they can then run
 * NYFactory().getParser("ErrorXMLNY")
 *
 * */

interface AbstractParserFactory {


    companion object {

        fun getFactory(s: String): AbstractParserFactory? {

            return when (s) {
                "NYFactory" -> NYFactory()
                "CAFactory" -> CAFactory()
                else -> null
            }
        }
    }

    /**
     * Our ParserFactory producer must implement a getFactory function
     *
     * */
    fun getParser(f: String): XMLParser?



}