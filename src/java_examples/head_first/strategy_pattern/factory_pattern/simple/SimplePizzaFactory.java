package head_first.strategy_pattern.factory_pattern.simple;

/**
 * Our SimplePizzaFactory which handles the creation of Pizza objects to return to our PizzaStore!
 *
 *
 *
 * This factory only has one "job" in life. And that is to create Pizza's for Mr.PizzaStore
 * */
public class SimplePizzaFactory {

    /**
     * Our Factory method which takes in a type of pizza in String format and then returns a Pizza!
     *
     *
     */
    public Pizza createPizza(String typeOfPizza)
    {
        // Initially our Pizza is null, which is to be determined through the passed in parameter and conditionals below
        Pizza pizza = null;

        // All instantiations of the "type" of pizzas are possible because of the polymorphic relationship of
        // inheritance with Pizza. VeggiePizza, CheesePizza etc. are all subclasses of Pizza!
        if (typeOfPizza.equals("cheese"))
        {
            pizza = new CheesePizza();
        } else if (typeOfPizza.equals("veggie"))
        {
            pizza = new VeggiePizza();
        } else if (typeOfPizza.equals("clam"))
        {
            pizza = new ClamPizza();
        } else if (typeOfPizza.equals("pepperoni"))
        {
            pizza = new PepperoniPizza();
        }

        // Once a type of pizza has been assigned return it out!
        return pizza;
    }
}
