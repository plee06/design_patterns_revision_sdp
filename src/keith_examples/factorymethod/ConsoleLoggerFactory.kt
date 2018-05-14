package factorymethod

// This is Concrete Creator class which has the extends the LoggerFactory()
// and returns an instantiation of the ConsoleLogger() which is the Concrete Product
// Each subclass of the abstract Creator will return its own instantiated version of the needed Product
// based on what is passed into the Factory
class ConsoleLoggerFactory : LoggerFactory() {
    override val logger: Logger
        get() = ConsoleLogger()
}