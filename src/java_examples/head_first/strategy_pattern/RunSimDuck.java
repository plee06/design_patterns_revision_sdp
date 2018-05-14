package head_first.strategy_pattern;

public class RunSimDuck {

    public static void main(String[] args) {
        Duck md = new MallardDuck();

        md.performFly();
        md.performQuack();


        // Below, the ModelDuck has a "set" initialization of no fly behavior, but thanks to the "setter" method we can
        // change this behavior on the fly at run-time!

        Duck model = new ModelDuck();

        model.display();

        model.performFly();

        // Set behavior dynamically here
        model.setFlyBehavior(new RocketFly());

        // Now the Model Duck can fly with rockets!
        model.performFly();
    }
}
