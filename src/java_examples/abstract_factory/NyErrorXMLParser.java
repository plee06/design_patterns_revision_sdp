package abstract_factory;

import factory.XMLParser;

public class NyErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("NY PARSING ERROR XML...");
        return "NY ERROR XML MESSAGE ";
    }
}
