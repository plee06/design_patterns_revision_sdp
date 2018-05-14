package factory;

/**
 * Runner of our Factory method pattern ...
 *
 *
 * */
public class TestFactoryMethodPattern {


    public static void main(String[] args) {
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        /**
         * So what's going on here?
         *
         * We created a specific Product interface of XMLParser which is implemented by all our various
         * concrete products such as ErrorXMLParser, OrderXMLParser etc.
         *
         * These concrete products all implemented the XMLParser interface.
         *
         * We then created our Creator class which is the actual "Factory class" which has our "Factory method"
         * which is the getParser() method.
         *
         * The getParser() factory methods are implemented by all our concrete Factory classes which implement
         * that factory method.
         *
         * In our main (the application) we will create our Factory object (which has a bunch of subclasses
         * that extend from it) and has one declared method which is getting the actual parser, parsing the XML
         * and then returning the value needed.
         *
         * In our main we will ask our Factory method to create the new service but the service
         * is actually created in our subclasses which is returned to the Factory Super Class (DisplayService)
         * through composition in the display method and then used. So the creation of objects is actually done
         * in our subclasses!
         *
         * The main thing here is that instead of saying FeedbackXMLParser fp = new FeedbackXMLParser() ...
         * and ErrorXMLParser ep = new ErrorXMLParser() ... etc.
         *
         * we delegate that task to our Factory which then will create those objects and return it and so instead
         * of having a bunch of different objects that we need to make calls to we just have one "factory" object
         * which creates the object needed to do the job. Consider how here we just keep reassigning a value to
         * service!
         *
         *
         * */
    }

}
