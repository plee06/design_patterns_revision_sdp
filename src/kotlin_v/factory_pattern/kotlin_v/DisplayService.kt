package kotlin_v.factory_pattern.kotlin_v

/**
 *
 * Our Factory class which is used to instantiate the various XMLParser based on a String passed in
 *
 * Note that with Factory it can be a method that returns it based on the subclass types or
 * literal subclass types can be passed in and then instantiated by the actual subclass type.
 *
 *
 * */
abstract class DisplayService {


    /**
     * The companion object is the Kotlin equivalent of static.
     *
     * These methods can be called with just the Class qualifier i.e. DisplayService.runFactory(...)
     *
     * */
    companion object{
        fun runFactory(ds: DisplayService) {
            println("Creating your Object")
            println("********")

            Thread.sleep(2000) // Use main Thread and sleep between Object creations for 2 seconds

            when (ds) {
                is ErrorXMLDisplayService -> ErrorXMLDisplayService().getParser()
                is FeedBackXMLDisplayService -> FeedBackXMLDisplayService().getParser()
            }

            println("Your Object of ${ds::class.simpleName} has been created. Here you go.")
        }
    }


    /**
     * Factory method displayed to the outer world
     *
     * */
    abstract fun getParser(): XMLParser



}

