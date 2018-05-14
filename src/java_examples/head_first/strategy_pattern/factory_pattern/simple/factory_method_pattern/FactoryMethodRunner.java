package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;


// Our Runner of the Factory method, let's test it all out!
public class FactoryMethodRunner {

    public static void main(String[] args) {
        // Create our stores
        PizzaStore nyStyle = new NyStylePizzaStore();
        PizzaStore chicagoStyle = new ChicagoStylePizzaStore();


        // Okay, now we pretend like we are a customer and order!
        /*
        * Remember what is going on:
        *
        * Our orderPizza() method is called in our PizzaStore class because we want this to be the same with
        * all our franchises, and because of our "final" it can't be overridden, hence you must follow my ways!
        *
        * Within orderPizza() it calls createPizza() which is abstract in our abstract class of Pizza, this is called
        * appropriately in each subclass i.e. NyStore or ChicagoStore which adds their own flavorings and returns
        * the specific pizza.
        *
        * Hence, our PizzaStore franchise is closed to modification but still open in the sense that our specific
        * subclasseed stores can add their own flavorings to their createPizza() method but they all conform
        * to our "orderPizza()" framework!
        *
        * */

        // We get someone who want's New York style, direct them there.
        nyStyle.orderPizza("cheese");

        // Now we got someone who wants cheese but in Chicago style!
        chicagoStyle.orderPizza("cheese");
    }

}
