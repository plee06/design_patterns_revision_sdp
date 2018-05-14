package head_first.strategy_pattern.decorator_pattern;

/*
* Special Avocado Condiment. Good or bad?
*
* */
public class Avocado extends CondimentsDecorator{

    Beverage beverage;

    public Avocado(Beverage b)
    {
        this.beverage = b;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescsription() + ", Avocado";
    }

    @Override
    double cost() {
        // Avocado always costs a lot, 5 extra dollar dollar bills yall added to whatever the cost of the beverage
        //we get passed in is.
        return 5.00 + this.beverage.cost();
    }
}
