package state;

/**
 *
 * runner of our state design pattern
 *
 * */
public class StateRunner {


    public static void main(String[] args) {
        // first we create our Robot object

        Robot robot = new Robot();

        // currently on an "on state"
        robot.walk();
        // we call cook() in the on state which switches over to the "cook" state, if we run "off" it says
        // we cant turn off in cooking state!
        robot.cook();
        robot.off();
        // we then go back to the "on state" here
        robot.walk();
        // we then move to the "off" state. if we try to cook, it'll return cant cook in off state
        robot.off();
        robot.cook();


        System.out.println("==========");


        // turn back on
        robot.walk();
        robot.off();
        robot.cook();

        /**
         * So what's going on here?
         *
         * Instead of having a bunch of different methods in our Robot object for various states
         * like "walkWhenOff" or having conditionals in walk like "if (this.state == "off")" we instead
         * compose the robot with various state objects and based on the method calls in each one of these
         * states we will accordingly set a new state (the changing of state happens in our method calls
         * NOT the client).
         *
         *
         * */
    }
}
