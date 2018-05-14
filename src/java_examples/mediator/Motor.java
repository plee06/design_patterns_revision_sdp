package mediator;

public class Motor implements Colleague {

    private MachineMediator mediator;
    /**
     * Only one job, set the mediator for this current Concrete Colleague
     *
     * @param mediator sets the mediator
     */
    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    void startMotor() {
        System.out.println("Starting Motor");
    }
    void rotateDrum() {
        System.out.println("Rotate the Drum");
    }
}
