package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern

/**
 *
 * Abstract Factory Pattern Runner
 *
 * */


fun main(args: Array<String>) {




    try {
        // Instantiate a Factory that we want
        println("Creating the California Factory for California XML Products")
        val cf: AbstractParserFactory = AbstractParserFactory.getFactory("CAFactory")!!
        println("********************")

        Thread.sleep(5000)

        for (i in 1..10) {
            // Get the Parsers #
            Thread.sleep(1000)
            println("Creating your parsers for you from the CAFactory please wait...")
            println()
            Thread.sleep(3000)
            cf.getParser("CAErrorXMLParser")
            println()
            Thread.sleep(1000)
            cf.getParser("CAFeedBackXMLParser")
            println()
        }

        // Change factory to NYFactory
        println("Creating the NY Factory for NY XML Products")
        val ny: AbstractParserFactory = AbstractParserFactory.getFactory("NYFactory")!!
        println("********************")

        Thread.sleep(5000)

        // Get more Parsers
        for (i in 1..10) {
            Thread.sleep(1000)
            println("Creating your parsers for you from the NYFactory please wait...")
            println()
            Thread.sleep(3000)
            ny.getParser("NYErrorXMLParser")
            println()
            Thread.sleep(1000)
            ny.getParser("NYFeedBackXMLParser")
            println()
        }

    } catch (npe: NullPointerException) {
        println("Sorry but we couldn't find the appropriate object.")
    }
}
