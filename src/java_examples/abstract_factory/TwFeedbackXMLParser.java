package abstract_factory;

import factory.XMLParser;

public class TwFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("FEEDBACK XML PARSER TW");
        return "Tw feedback XML Parsing...";
    }
}
