package abstract_factory;

/**
 * this is optional but it provides the avoidance of dependency between client code and the factories.
 * This provides a static method which will return the apporpriate factory!
 *
 *
 * */
public final class ParserFactoryProducer {

    // prevent instantiation of this Class
    private ParserFactoryProducer() {
        throw new AssertionError();
    }


    public static AbstractParserFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "NYFactory": return new NyParserFactory();
            case "TWFactory": return new TwParserFactory();
        }

        // otherwise return null
        return null;
    }
}
