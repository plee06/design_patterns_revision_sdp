package state;

/**
 * another state object
 *
 *
 * */
public class RoboticCook implements RoboticState {

    // composition of the robot context object so this state object can call the appropriate methods to
    // set the appropriate states
    private final Robot robot;

    public RoboticCook(Robot robot) {
        this.robot = robot;
    }


    @Override
    public void walk() {
        System.out.println("Walking .... ");
        robot.setRoboticState(robot.getRoboticOn());

    }

    @Override
    public void off() {
        System.out.println("Cannot be switched off  in cooking state .... ");

    }

    @Override
    public void cook() {
        System.out.println("Cooking ... ");

    }
}
