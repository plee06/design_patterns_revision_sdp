package mediator;

/**
 * Java Design Pattern Notes.
 *
 * Our Mediator interface class for the Washing Machine.
 *
 * It's sole purpose is to be implemented by the Concrete Washing Machine!
 *
 * It just acts as a Generic Mediator!
 *
 * */
public interface MachineMediator {

    /*
    * This interface has all the functionality the concrete machine washing objects need to communicate and receive
    * what they need from their colleagues
    *
    * */
    void start();
    void wash();
    void open();
    void closed();
    void on();
    void off();
    boolean checkTemperature(int temp);



}
