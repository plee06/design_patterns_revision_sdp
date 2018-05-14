package state;

/**
 * represents a concrete state object
 *
 *
 * */
public class RoboticOn implements RoboticState {

    // reference to the Context object
    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking ... ");

    }

    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is now off");

    }

    @Override
    public void cook() {
        System.out.println("Cooking .... ");
        robot.setRoboticState(robot.getRoboticCook());

    }
}
