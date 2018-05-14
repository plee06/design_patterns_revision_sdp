package creational.abstract_factory.factory

/**
 * Transport Interface that handles different logistics for different types of Transport ...
 *
 * This is a Product type that supports all Transport type products.
 * */
interface Transport {

    // All Transport types must implement a go() method
    fun go(): String

}