package head_first.strategy_pattern.factory_pattern.simple;

/**
 * My PizzaStore class which represents a single pizza store.
 *
 * Question here: Why is the 'new' keyword considered "bad"?
 *
 * --> The "new" keyword is an example of a concrete implementation, i.e. we are tying in our specific
 * variable that is now an instantiated object with that Class object.
 *
 * If we need to change anything in the future that Class object has to be modified, it's not "closed to modification",
 * --> enter the Factory pattern.
 *
 *
 *
 * */
public class PizzaStore {
    // "Composition" here, i.e. declare the instance variable which is our Factory
    SimplePizzaFactory factory;


    // Public constructor which takes in the factory type and sets the factory!
    // In this case here it's just one SimplePizzaFactory ...
    public PizzaStore(SimplePizzaFactory factory)
    {
        this.factory = factory;
    }

    // The method that runs when someone orders a pizza!

    /**
     * Takes in a String type that is the type of pizza to be ordered and returns that pizza!
     *
     *
     * @param typeOfPizza
     */

    public Pizza orderPizza(String typeOfPizza)
    {
        /*
        * Here what we are doing is we are delegating the pizza creation to our factory to create the pizza
        * and so instead of tying it in with a "concrete implementation", the "concrete implementation" is done
        * in the factory and so any future changes we don't change this code here of PizzaStore but instead we change it
        * in the our SimplePizzaFactory!
        *
        * Thus, we obey the "Open Closed Principle" in SOLID with PizzaStore.
        *
        * */
        Pizza pizza = factory.createPizza(typeOfPizza);

        // These following methods are the methods that don't change. Same for all pizzas!
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }


}
