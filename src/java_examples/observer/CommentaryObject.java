package observer;

import java.util.List;

/**
 * This is our CommentaryObject that is the Subject.
 *
 * It implements both Subject and Commentary interface. Subject interface necessary to follow the Observer pattern
 * and the Commentary interface (optional, just following OOP Principles).
 *
 *
 * */
public class CommentaryObject implements Subject, Commentary {

    // A list of all our Observers that are subscribed to us! It's a reference to all our Observers,
    // we need this to update each one everytime we get a new commentary set. -> This'll of course be simulated ...
    private final List<Observer> allObservers;

    // This is our description i.e. "commentary"
    private String desc;

    // Our Subject details, what is this Subject? This of course doesn't change hence final.
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.allObservers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;

    }

    @Override
    public void registerObserver(Observer o) {
        this.allObservers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        this.allObservers.remove(o);

    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer obs : this.allObservers) {
            obs.update(this.desc);
        }

    }

    @Override
    public String subjectDetails() {
        return this.subjectDetails;
    }
}
