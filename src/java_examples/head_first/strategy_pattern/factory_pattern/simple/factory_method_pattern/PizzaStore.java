package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;


/*
* Now the PizzaStore is an abstract class.
*
* Instead of having "small factories" to return instantiated objects of the Pizza, we want specific "flavorings"
* and so we are going to create subclasses to handle the Pizza creation and return the Pizza!
*
* */
public abstract class PizzaStore {

    // By declaring this "final" we make sure that all franchises conform to our orderPizza ways!
    final Pizza orderPizza(String typeOfPizza)
    {

        // Get the Pizza from our abstract method of createPizza(...) which is implemented in our
        // subclasses that extend this abstract class!

        // We delegate the creation of pizza to our subclasses
        Pizza pizza = createPizza(typeOfPizza);


        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    };

    abstract Pizza createPizza(String typeOfPizza);
}
