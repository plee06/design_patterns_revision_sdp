package factory;

/**
 * another display service subclass
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
