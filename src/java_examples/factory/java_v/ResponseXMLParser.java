package java_examples.factory.java_v;

/**
 * Implementation of a Concrete Product
 *
 *
 * */
public class ResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing response XML");
        return "Response XML Parser";
    }
}
