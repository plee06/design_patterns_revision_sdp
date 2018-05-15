package abstract_factory;

public class NyFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY PARSING FEEDBACK XML");
        return "NY FEEDBACK XML MESSAGE";
    }
}
