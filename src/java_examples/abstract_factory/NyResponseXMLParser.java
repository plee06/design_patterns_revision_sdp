package abstract_factory;

import factory.XMLParser;

public class NyResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY PARSING RESPONSE XML");
        return "NY RESPONSE XML MESSAGE";
    }
}
