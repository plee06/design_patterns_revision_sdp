package mediator;

import java.util.Collection;

public class Button implements Colleague {

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
    * This colleague has one job, as it's the Button object it's one job is to be pressed and when it is pressed
    * it'll ask the mediator to start the machine.
    *
    * And instead of directly speaking with our WashingMachine which has various other components to run, it'll
    * ask the mediator to delegate appropriately.
    *
    * */
    void press() {
        System.out.println("Button pressed");
        this.mediator.start();
    }
}
