package head_first.strategy_pattern;

public class FlyNoWay implements FlyInterface {

    @Override
    public void fly()
    {
        System.out.println("I can't fly!");
    }
}
