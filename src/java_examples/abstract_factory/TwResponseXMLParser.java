package abstract_factory;

import factory.XMLParser;

public class TwResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("RESPONSE XML PARSER TW");
        return "TW XML PARSER RESPONSE";
    }
}
