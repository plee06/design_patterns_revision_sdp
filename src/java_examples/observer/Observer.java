package observer;

/**
 * Our Observer interface that is used by concrete observer implementations!
 * This is the interface that concrete observers implement and subscribe to the subject
 *
 * */

public interface Observer {


    /*
    * The Observer interface comes with three methods
    *
    * */

    /*
    * Update this current Observer with the appropriate information
    *
    * Important to note: that this method is called on by the Subject to "notify" all observers but the implementation
    * details are of course left up to the Observers!
    *
    *
    * */
    void update(String desc);

    /*
    * Subscribe to some Subject
    *
    * */
    void subscribe();

    /*
    * Unsubscribe from some subject
    *
    *
    * */
    void unsubscribe();
}
