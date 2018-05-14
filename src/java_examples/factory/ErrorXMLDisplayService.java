package factory;


/**
 * this is our subclasses of DisplayService which will do the actual implementation of the parser
 * to instantiate the specific parser object and return it up to DisplayService
 *
 *
 *
 * */
public class ErrorXMLDisplayService extends DisplayService {


    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
