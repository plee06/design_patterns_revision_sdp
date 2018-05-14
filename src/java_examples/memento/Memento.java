package memento;

/**
 * Mimics our Originator object to save the state accordingly
 *
 *
 * */
public class Memento {

    private double x;
    private double y;

    // on creation of the Memento save that state as part of the constructor
    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }

    /**
     * No setter methods as its one job is to just return the state according to the save state
     *
     *
     * */


}
