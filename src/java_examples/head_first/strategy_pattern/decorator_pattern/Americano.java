package head_first.strategy_pattern.decorator_pattern;

/*
* Another Concrete implementation of our Beverage Component!
*
* This time it's an Americano ... My favorite.
*
* */
public class Americano extends Beverage {

    // Set the description upon constructing the Americano object
    public Americano()
    {
        this.description = "Americano";
    }

    @Override
    double cost()
    {
        // Americano will cost me 1.99 .... fuck.
        return 1.99;
    }

}
