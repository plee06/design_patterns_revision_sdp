package java_examples.factory.java_v;

/**
 * This is an abstract service class which will display all the specific parsed messages from the parsers, it'll be
 * extended by each specific service
 *
 *
 * */
abstract class DisplayService {

    // display method here is used to display the actual message to the user
    // the getParser() method is our factory method which is implemented by the subclasses
    // to instantiate the specific parser that is needed
    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    // we declare here an abstract method which will return the parser and it is to be implemented
    // in the specific service objects
    protected abstract XMLParser getParser();


}
