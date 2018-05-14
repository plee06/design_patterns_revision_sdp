package mediator;

public class Valve implements Colleague {


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

    /*
    * This method opens up the valve and then asks the mediator to close the valve afterwards so water isn't
    * spilling everywhere!
    *
    * */

    void open() {
        System.out.println("Valve is opened");
        this.mediator.closed();
    }

    /*
    * This second method of closed defines the closing of the valve. Instead of asking the heater to turn on the heat
    * after closing the water valve it'll ask the mediator (delegate) the heat on method.
    *
    * */
    void close() {
        System.out.println("Valve is closed");
        this.mediator.on();
    }
}
