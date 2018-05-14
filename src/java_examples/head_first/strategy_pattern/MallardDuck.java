package head_first.strategy_pattern;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a Mallard Duck!");
    }
}
