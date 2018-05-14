package observer;


import java.util.ArrayList;

/**
 * Simulation of our Observer Pattern
 *
 *
 * */
public class ObserverRunner {

    public static void main(String[] args) {
        // Instantiate our Subject
        CommentaryObject coSubject = new CommentaryObject(new ArrayList<>(), "Soccer match");

        // Instantiate various SMSUsers and pass in the Subject they are interested in along with userInfo
        SMSUsers paul = new SMSUsers(coSubject, "Paul");
        SMSUsers lilly = new SMSUsers(coSubject, "lilly");

        // Subscribe our SMSUsers! Remember they can also be unsubscribed or just sit idly ...
        // The subject is already set within constructor, this can also be changed ... Experiment later
        paul.subscribe();
        lilly.subscribe();

        // Simulation of the Soccer game!
        coSubject.setDesc("OH NO IBRAHIMOVIC HAS SCORED!");
        // We've set a new description update the observers (this can be done on update through methods) experiment later
        coSubject.notifyObservers();

        // Another update
        coSubject.setDesc("The score is now 1-0!");
        coSubject.notifyObservers();

        // Paul is no longer interested ... unsubscribe
        paul.unsubscribe();

        // Now only lilly gets updates

        coSubject.setDesc("AND AGAIN, IBRAHIMOVIC HAS SCORED!");
        coSubject.notifyObservers();

        // The important thing here is that it's flexible, the only thing the Subject has to know is that
        // whatever object gets added to it's observers list is that it is an observer!

    }
}
