package abstract_factory;

import factory.XMLParser;

public class TwErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW ERROR PARSING XML");
        return "TW ERROR XML PARSE";
    }
}
