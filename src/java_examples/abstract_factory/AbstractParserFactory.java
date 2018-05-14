package abstract_factory;

import factory.XMLParser;

/**
 * This is the interface which will be implemented by all our concrete factories
 *
 *
 * */
public interface AbstractParserFactory {



    // it has one method which gets the specific parser instance
    public XMLParser getParserInstance(String parserType);


}
