package mediator;

public class Heater implements Colleague {
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
    * Turns on the heat.
    * Switches on the heater and sets temperature accordingly
    *
    * */
    void on(int temp) {
        System.out.println("Heater is on");

        if (this.mediator.checkTemperature(temp)) {
            System.out.println("Temperature is set to: " + temp);
            this.mediator.off();
        }

    }

    /*
    * Turns off the heater and runs the wash cycle, asks the mediator to do it!
    *
    *
    * */
    void off() {
        System.out.println("Turning off heater.");
        this.mediator.wash();
    }
}
