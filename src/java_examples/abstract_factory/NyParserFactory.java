package abstract_factory;

import factory.XMLParser;

/**
 * concrete factory specific to NY
 *
 * */
public class NyParserFactory implements AbstractParserFactory {



    @Override
    public XMLParser getParserInstance(String parserType) {
        // based on the specific praser type for the NyFactory... return the appropriate Ny parser
        switch(parserType) {
            case "NYERROR": return new NyErrorXMLParser();
            case "NYFEEDBACK": return new NyFeedbackXMLParser();
            case "NYORDER": return new NyOrderXMLParser();
            case "NYRESPONSE": return new NyResponseXMLParser();
        }

        return null;
    }
}
