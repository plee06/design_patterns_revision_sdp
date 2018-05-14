package head_first.strategy_pattern.decorator_pattern;

/*
* This is a concrete implementation of our Beverage!
*
* It has an "is-a" relationship with Beverage
*
* */

public class Espresso extends Beverage {

    // Upon construction of Espresso set the description appropriately, the method of getDescription() here is inherited
    public Espresso()
    {
        this.description = "Espresso";
    }

    // An Espresso will cost 1.50
    @Override
    double cost() {
        return 1.50;
    }


}
