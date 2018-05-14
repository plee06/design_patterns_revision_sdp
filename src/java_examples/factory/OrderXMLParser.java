package factory;


/**
 * Another Concrete Product XMLParser that parses orders
 *
 *
 * */

public class OrderXMLParser implements XMLParser {


    @Override
    public String parse() {
        System.out.println("Parsing order XML");
        return "Order XML Message";
    }
}
