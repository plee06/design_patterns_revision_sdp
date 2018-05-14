package creational.abstract_factory.factory

/**
 *
 * Concrete Creator class which returns a concrete version of the Car
 * extends from TransportCreator
 *
 * */

class CarCreator : TransportCreator() {


    override fun getTransport(t: String) = Class.forName(t).getConstructor().newInstance()
}
