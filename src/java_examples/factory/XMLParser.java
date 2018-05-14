package factory;

/**
 * This is the product that we want to create from our Factory which is the XMLParser for this example.
 *
 * This interface defines the one method that every ConcreteProduct should have which is Parse
 * for all concrete XMLParser objects.
 *
 *
 * */
public interface XMLParser {

    // the one method that is needed by all our XMLParser concrete objects ...
    public String parse();



}
