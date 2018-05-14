package observer;

/**
 * This represents our Subject interface which is the "subject" for the Observer pattern, i.e. all observers
 * will subscribe to the concrete instance that implements this Subject!
 *
 * */
public interface Subject {


    /*
    * Comes with four default methods
    *
    * */

    /*
    * Registers the observers
    *
    * */
    void registerObserver(Observer o);

    /*
    * Removes an observer as a subscriber
    * */
    void removeObserver(Observer o);

    /*
    * Updates all subscribers
    *
    * */
    void notifyObservers();

    /*
    * Returns the details of this current concrete subject that implements this method!
    *
    * A bit trivial, optional really but good to use!
    * */
    String subjectDetails();

}
