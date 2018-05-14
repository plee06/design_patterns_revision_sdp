package creational.abstract_factory.factory



/**
 * Another Concrete Creator class which returns the Train product
 *
 *
 * */

class TrainCreator : TransportCreator() {

    init {
        println("Initialized Train Creator")
    }

    override fun getTransport(t: String) = Class.forName(t).getConstructor().newInstance()
}