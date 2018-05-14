package factory;

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
