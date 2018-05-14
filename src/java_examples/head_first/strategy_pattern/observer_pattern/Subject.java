package head_first.strategy_pattern.observer_pattern;

/*
* Defines the Observer Pattern Subject Interface
*
* Remember that the Subject Object's job is to manage some bit of data.
*
* The Observer Objects rely on the Subject Object.
*
* */
public interface Subject {

    // For Subject in the Observer pattern in general we need to have three methods:
    /*
    * 1. Register Observers
    * 2. Remove Observers
    * 3. Notify Observers
    *
    *
    * */

    // Register an Observer with this Subject object
    public void registerObserver(Observer o);

    // Remove an Observer with this Subject object
    public void removeObserver(Observer o);

    // Notify the Observers on a change
    public void notifyObservers();


}
