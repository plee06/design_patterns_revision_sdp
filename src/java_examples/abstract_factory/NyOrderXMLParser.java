package abstract_factory;

import factory.XMLParser;

public class NyOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY PARSING ORDER XML");
        return "NY ORDER XML MESSAGE";
    }
}
