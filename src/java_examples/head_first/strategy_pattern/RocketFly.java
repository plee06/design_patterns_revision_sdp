package head_first.strategy_pattern;

public class RocketFly implements FlyInterface {

    @Override
    public void fly()
    {
        System.out.println("I'm a rocket powered duck!");
    }

}
