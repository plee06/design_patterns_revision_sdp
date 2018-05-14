package state;


/**
 * This is our Context interface which is implemented by our Context Object, not necessary but follows
 * OOP principles of abstracting the behaviour out into an "abstraction" instead of tying it into a specific
 * concrete class.
 *
 * Think -> What if we need multiple robots? We want it to conform to this interface ...
 *
 *
 * */
public interface RoboticState {


    public void walk();
    public void off();
    public void cook();


}
