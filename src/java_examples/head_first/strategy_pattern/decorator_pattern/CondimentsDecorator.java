package head_first.strategy_pattern.decorator_pattern;

/*
* Our *abstract CondimentsDecorator class that is used to
* "decorate" our concrete Beverage objects with condiments! Yummy....
*
*
*
*
* */

// Must extend Beverage to be able to "wrap" our Beverages, i.e. share the same Super type!
public abstract class CondimentsDecorator extends Beverage {

    // All our Condiments must implement this getDescription() method.
    /*
    * The question arise: Why?
    *
    * Well that's because each condiment must add to the original beverage it's own condiment!
    *
    * i.e. instead of a Dark Roast wrapped in Mocha wrapped in Soy returning only "Dark Roast"
    *
    * we want it to return Dark Roast, Mocha, Soy ...
    *
    * */
    public abstract String getDescription();
}
