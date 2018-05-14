package creational.abstract_factory.factory


/**
 *
 * Creator type which is a class which returns a Factory type
 *
 * */

open class TransportCreator {

    init {
        println("Top level Creator initialized")
    }

    open fun getTransport(t: String) =

        when (t) {
            "Car" -> CarCreator().getTransport(t)
            "Train" -> Class.forName(t).getConstructor().newInstance() as Transport
            else -> "Not known"
        }



}