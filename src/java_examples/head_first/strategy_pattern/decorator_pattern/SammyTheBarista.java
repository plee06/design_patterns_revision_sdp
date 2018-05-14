package head_first.strategy_pattern.decorator_pattern;

/*
* Simulation of our Barista called Sammy... guy or girl?
*
* */

public class SammyTheBarista {

    public static void main(String[] args) {
        // Here we're going to create the Drink. Let's say Bob orders an Americano.

        // Creation of an Americano
        Beverage beverage = new Americano();
        // Give Bob the cost of the Americano
        System.out.println(beverage.cost());

        // Bob says he also wants to add Mocha
        // Okay we say. Let's decorate it then!
        // Here we construct a new Mocha object that is wrapping our beverage which is an Americano object.
        beverage = new Mocha(beverage);
        // Okay, now what's the cost?
        System.out.println(beverage.cost());

        // Oh but wait! Bob also wants to add the special Avocado condiment...
        beverage = new Avocado(beverage);

        // So the cost now?
        System.out.println(beverage.cost());
    }
}
