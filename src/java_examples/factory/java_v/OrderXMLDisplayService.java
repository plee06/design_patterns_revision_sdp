package java_examples.factory.java_v;


/**
 * another display service subclass
 *
 * This is a Concrete Product
 *
 *
 *
 * */
public class OrderXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
