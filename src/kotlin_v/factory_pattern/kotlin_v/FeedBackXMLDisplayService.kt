package kotlin_v.factory_pattern.kotlin_v

/**
 * Concrete Creator which returns a FeedBackXMLParser
 *
 *
 * */
class FeedBackXMLDisplayService : DisplayService() {


    override fun getParser() = FeedBackXMLParser()
}