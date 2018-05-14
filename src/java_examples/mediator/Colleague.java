package mediator;

/**
 * Colleague interface whose job is to be implemented by all Concrete Colleagues.
 *
 * Only has one job, set the Mediator!
 *
 * */
public interface Colleague {

    /**
     * Only one job, set the mediator for this current Concrete Colleague
     *
     * @param mediator sets the mediator
     * */
    void setMediator(MachineMediator mediator);
}
