package java_examples.factory.java_v;

/**
 * An Example Concrete Product which implements our XMLParser interface
 *
 * This is the Concrete Product that our Factory must return.
 *
 * */
public class ErrorXMLParser implements XMLParser {



    @Override
    public String parse() {
        System.out.println("Parsing error XML ... ");
        return "ERROR XML MESSAGE!";
    }


}
