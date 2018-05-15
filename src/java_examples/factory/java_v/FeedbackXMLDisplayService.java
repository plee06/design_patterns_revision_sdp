package java_examples.factory.java_v;

/**
 * another display service subclass
 *
 *
 * */
public class FeedbackXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new FeedbackXML();
    }
}
