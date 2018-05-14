package state;

/**
 *
 * and another state object ...
 *
 * */
public class RoboticOff implements RoboticState {

    private final Robot robot;

    public RoboticOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking ... ");
        this.robot.setRoboticState(robot.getRoboticOn());

    }

    @Override
    public void off() {
        System.out.println("Already switched off ");

    }

    @Override
    public void cook() {
        System.out.println("Cannot cook on an Off state");

    }
}
