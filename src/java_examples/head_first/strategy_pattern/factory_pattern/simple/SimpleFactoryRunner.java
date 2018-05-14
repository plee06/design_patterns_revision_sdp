package head_first.strategy_pattern.factory_pattern.simple;


/*
* Test running our Simple Factory Pattern!
*
*
* Before we continue, define for me the Simple Factory Pattern. What was it again?
*
* In short summary, the Simple Factory Pattern is where instead of creating our Concrete implementations
* with the new keyword, we instead run a Factory method which returns to us a Concrete implementation.
*
* This way, if any future changes are needed we don't need to modify our "client" facing code and instead we
* can modify the factory!
*
* It's a way of delegating our object instantiation!
*
* */
public class SimpleFactoryRunner {


    public static void main(String[] args) {
        // First bring out the Factory!
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

        // Next we want to create our Pizza Store with the Factory in place
        PizzaStore leesPizza = new PizzaStore(simplePizzaFactory);

        // Now let's say someone makes an order!
        /*
        * Here we now create the instantiation of "cheese" pizza within leesPizza but instead of tying it in with
        * the new keyword we delegate the creation of cheese pizza to the Factory.
        *
        *
        * But wait, it doesn't seem that great? We're just delegating it to another object? I can just modify it no?
        *
        * But think about how if you had 10 PizzaStore and in each one you had to change the "cheese" pizza creation.
        *
        * Do you really want to go and modify 10 different PizzaStore? Or just modify it in one place? i.e. the Factory?
        *
        *
        * You right ...
        * */
        leesPizza.orderPizza("cheese");


    }
}
