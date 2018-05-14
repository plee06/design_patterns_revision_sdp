package memento;

/**
 * The Class for all our Originator Objects, this is the Object which wants to save its state to some Memento
 * Object!
 *
 *
 * */
public class Originator {

    private double x;
    private double y;

    // This String stores the key name of the last saved memento in order to implement the undo operation
    private String lastUndoSavepoint;

    /*
    * The CareTaker Object is used to save and retrieve the memento objects which represent the state of the
    * Originator object.
    *
    * Use of Object COMPOSITION! We compose this Originator object with the careTaker object which takes care
    * of all of our memento saving and retrieval
    *
    *
    * */
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;


        // This method creates a memento object and requests the careTaker to take care of the object
        createSavepoint("INITIAL");
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    void createSavepoint(String savepointName) {
        careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
        lastUndoSavepoint = savepointName;
    }
    // restore the last saved point
    void undo() {
        setOriginatorState(lastUndoSavepoint);
    }
    // restore a specific saved point
    void undo(String savepointName) {
        setOriginatorState(savepointName);
    }
    // ask caretaker to erase all save points and set it to initial savepoint
    void undoAll() {
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    // set the originator state and ask careTaker to set it
    void setOriginatorState(String savepointName) {
        Memento mem = careTaker.getMemento(savepointName);
        this.x = mem.getX();
        this.y = mem.getY();
    }

    @Override
    public String toString() {
        return "X: " + x + " Y: " + y;
    }
}
