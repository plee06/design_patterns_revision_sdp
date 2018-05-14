package head_first.strategy_pattern.decorator_pattern;

/*
* Concrete implementation of our CondimentsDecorator ... this is a Mocha condiment!
*
*
* */
public class Mocha extends CondimentsDecorator {
    // Instance variable which allows us to "wrap" the beverage that is passed in
    Beverage beverage;


    // Constructor method that actually does the "wrapping", i.e. decoration!
    public Mocha(Beverage b)
    {
        this.beverage = b;
    }


    /*
    * The whole point of this override here is to add this condiment description to our "super" description, i.e. the
    * object that we are decorating! Dude, come on!
    *
    * */
    @Override
    public String getDescription() {
        return this.beverage.getDescsription() + ", Mocha";
    }

    @Override
    double cost() {
        // Adding Mocha is an extra 20 cents!
        return .20 + this.beverage.cost();
    }
}
