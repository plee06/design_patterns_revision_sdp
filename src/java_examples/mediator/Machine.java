package mediator;

public class Machine implements Colleague {

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

    // The Machine job is to start and wash
    // The open method here returns to the valve, so once the button is pushed, the button calls start and then
    // the machine will start by opening up the valve.
    void start() {
        this.mediator.open();
    }

    // Also starts the wash once valve is opened ...
    void wash() {
        this.mediator.wash();
    }
}
