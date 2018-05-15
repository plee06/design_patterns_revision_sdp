package java_examples.factory.java_v;

/**
 *
 * Another Concrete Product which parses XML type of feedback ...
 *
 * */
public class FeedbackXML implements XMLParser {


    @Override
    public String parse() {
        System.out.println("Parsing Feedback XML");
        return "Feedback XML Message";
    }
}
