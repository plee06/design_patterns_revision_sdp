package head_first.strategy_pattern;

public class FlyWithWings implements FlyInterface {


    @Override
    public void fly()
    {
        System.out.println("I'm flying!");
    }
}
