package state;

/**
 * This is our concrete Class (Context Object)
 *
 *
 * */
public class Robot implements RoboticState {

    private RoboticState roboticOn;
    private RoboticState roboticCook;
    private RoboticState roboticOff;

    private RoboticState state;

    public Robot() {
        this.roboticOn = new RoboticOn(this);
        this.roboticCook = new RoboticCook(this);
        this.roboticOff = new RoboticOff(this);

        // default state
        this.state = roboticOn;
    }

    public void setRoboticState(RoboticState state) {
        this.state = state;
    }


    // overridden methods ...
    @Override
    public void walk() {
        this.state.walk();


    }

    @Override
    public void off() {
        this.state.off();

    }

    @Override
    public void cook() {
        this.state.cook();

    }


    // regular methods
    public RoboticState getRoboticOn() {
        return this.roboticOn;
    }
    public void setRoboticOn(RoboticState roboticOn) {
        this.roboticOn = roboticOn;
    }
    public RoboticState getRoboticCook() {
        return this.roboticCook;
    }
    public void setRoboticCook(RoboticState roboticCook) {
        this.roboticCook = roboticCook;
    }
    public RoboticState getRoboticOff() {
        return this.roboticOff;
    }
    public void setRoboticOff(RoboticState roboticOff) {
        this.roboticOff = roboticOff;
    }
    public RoboticState getState() {
        return this.state;
    }
    public void setState(RoboticState state) {
        this.state = state;
    }
}
