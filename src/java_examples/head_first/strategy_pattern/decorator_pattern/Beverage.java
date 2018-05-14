package head_first.strategy_pattern.decorator_pattern;


/*
* Our abstract Beverage class!
*
* */
public abstract class Beverage {
    // Instance variable which holds the Description of this beverage
    String description = "This description will be overwritten by the concrete implementations of beverage!";

    /*
    * getDescription method which returns a description of this beverage that's set by the concrete implementations!
    *
    * */
    String getDescsription()
    {
        return this.description;
    }

    /*
    * An *abstract method that is to be implemented by our concrete implementations of Beverage
    *
    * */
    abstract double cost();
}
