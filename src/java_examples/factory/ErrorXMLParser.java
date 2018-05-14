package factory;

/**
 * An Example Concrete Product which implements our XMLParser interface
 *
 *
 * */
public class ErrorXMLParser implements XMLParser {



    @Override
    public String parse() {
        System.out.println("Parsing error XML ... ");
        return "ERROR XML MESSAGE!";
    }
}
