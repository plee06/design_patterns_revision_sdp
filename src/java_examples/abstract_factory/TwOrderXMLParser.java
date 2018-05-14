package abstract_factory;

import factory.XMLParser;

public class TwOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW ORDER XML PARSING ");
        return "ORDER XML PARSING FROM TW";
    }
}
