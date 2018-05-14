package abstract_factory;

import factory.XMLParser;

/**
 * Runner of our abstract factory method pattern ...
 *
 *
 * */
public class AbstractFactoryRunner {

    // our client
    public static void main(String[] args) {
        // our client wants a new parse factory and so they will use our static method to get the factory
        // that they need
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");

        // next they will get the specific parser instance they need by using the parserFactory
        // in this case they want a specific NEW YORK ORDER PARSER!!
        XMLParser parser = parserFactory.getParserInstance("NYORDER");
        String msg = "";
        msg = parser.parse();

        System.out.println(msg);

        System.out.println("************");

        // next our client now wants a different parser instance to parse XML so set it again
        parserFactory = ParserFactoryProducer.getFactory("TWFactory");
        parser = parserFactory.getParserInstance("TWFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);

        /*
        *
        * recap: So what exactly is happening here?
        *
        * We've create an "Abstract Factory Method" which is different from the Factory method in that the
        * Abstract Factory Method controls a Factory which then provides the apporpriate object where
        * as in the Factory Method Pattern we just communicated with one Factory. Abstract Factory Method Pattern
        * == many factories!
        *
        * Here we create one Abstract Factory which handles many different types of Factories (namely in this example
        * the TWFactory and NYFactory) we declare this AbstractParserFactory with a static method to get an instance
        * of the Factory this is done so we don't tie in a Factory instance variable with a specific factory
        * i.e. instantiate it directly with the new keyword, instead we get it through this static method
        * which from there we can then get the specific parser through that factory given to us through our
        * AbstractFactory!
        *
        *
        * **/
    }
}
