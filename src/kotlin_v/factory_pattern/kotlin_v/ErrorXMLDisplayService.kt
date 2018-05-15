package kotlin_v.factory_pattern.kotlin_v


/**
 * Concrete Creator that returns a specific Concrete Product
 *
 *
 * */

class ErrorXMLDisplayService : DisplayService() {

    override fun getParser() = ErrorXMLParser()


}
