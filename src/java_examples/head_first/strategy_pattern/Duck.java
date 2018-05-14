package head_first.strategy_pattern;

/**
 * Chapter 1 Example Work
 *
 * The Duck Abstract Superclass which will have many different Duck types subclassed amongst it
 *
 * */
public abstract class Duck {

    /*
    * Instance variables of the FlyBehavior and QuackBehavior interfaces which have direct subclasses
    * that implement various behaviors below them.
    *
    *
    * */
    FlyInterface flyBehavior;
    QuackInterface quackBehavior;

    // Empty no-args constructor of the Duck superclass
    public Duck() {};

    public abstract void display();

    public void performFly()
    {
        // Delegation to the behavior classes
        flyBehavior.fly();
    }

    public void performQuack()
    {
        // Delegation to the behavior classes
        quackBehavior.quack();

    }

    public void swim()
    {
        System.out.println("All ducks float!");
    }

    /*
    * Setter methods for "dynamic behavior" setting at run-time
    *
    *
    * */
    public void setFlyBehavior(FlyInterface fi)
    {
        this.flyBehavior = fi;
    }
    public void setQuackBehavior(QuackInterface qi)
    {
        this.quackBehavior = qi;
    }

}
