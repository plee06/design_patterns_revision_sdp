package head_first.strategy_pattern;

public class ModelDuck extends Duck {

    public ModelDuck()
    {
        // Begins with no way to Fly
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a model duck.");
    }
}
