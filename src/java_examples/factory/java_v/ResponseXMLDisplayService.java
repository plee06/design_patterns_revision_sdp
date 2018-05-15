package java_examples.factory.java_v;

/**
 * another display service subclass
 *
 *
 * */
public class ResponseXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
