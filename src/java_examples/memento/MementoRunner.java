package memento;

/**
 * Running of our Memento Design Pattern
 *
 *
 * */
public class MementoRunner {

    public static void main(String[] args) {
        // declare our careTaker object which is our "intermiediary" that takes care of saving the originator
        // state to memento objects and then returns the memento objects accordingly
        CareTaker careTaker = new CareTaker();

        // one of many possible originator objects ...
        Originator originator = new Originator(5,10, careTaker);

        System.out.println("DEFAULT STATE: " + originator);

        originator.setX(originator.getY() * 51);
        System.out.println("STATE: " + originator);

        // save this new state, in this method we create a new memento object and "save" our current state into it
        // createSavepoint of our originator method calls careTaker.saveMemento which will add this current Memento
        // object to our map with the String of SAVE1
        originator.createSavepoint("SAVE1");

        // change some more state
        originator.setY(originator.getX() / 22);
        System.out.println("STATE: " + originator);

        // undo that state of changing Y and go back to original Y. Here we retrieva our Memento object
        // from our map of Memento objects through the getMemento method in careTaker which retrievs the appropriate
        // object from our map
        // and then uses the Memento obejct state to set the originator state!!
        originator.undo();

        // state after undo
        System.out.println("STATE AFTER UNDO: " + originator);
    }
}
