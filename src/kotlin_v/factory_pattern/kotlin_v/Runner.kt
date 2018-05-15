package kotlin_v.factory_pattern.kotlin_v


/**
 *
 * Sample Client Runner
 *
 * */


fun main(args: Array<String>) {

    // Different types of XMLParser available to the client
    val parsers: Map<String, DisplayService> = mapOf(
            "ErrorXML" to ErrorXMLDisplayService()
            ,"FeedBackXML" to FeedBackXMLDisplayService()
    )

    try {
        for (i in 1..10) {
            // Get ErrorXML Object
            var eXML = DisplayService.runFactory(parsers.get("ErrorXML")!!)

            // Get FeedBackXML Object
            var fXML = DisplayService.runFactory(parsers.get("FeedBackXML")!!)
        }

        // Attempt null
        var nonExistent = DisplayService.runFactory(parsers.get("Something")!!)

    } catch (npe: NullPointerException) {
        println("Sorry but this Parser does not exist yet in our system.")
    }


}