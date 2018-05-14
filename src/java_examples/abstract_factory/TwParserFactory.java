package abstract_factory;

import factory.XMLParser;

/**
 * concrete factory specific to Tw
 *
 *
 * */
public class TwParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "TWERROR": return new TwErrorXMLParser();
            case "TWFEEDBACK": return new TwFeedbackXMLParser();
            case "TWORDER": return new TwOrderXMLParser();
            case "TWRESPONSE": return new TwResponseXMLParser();
        }

        // otherwise return null
        return null;
    }
}
