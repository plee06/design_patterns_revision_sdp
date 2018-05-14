package observer;

/**
 * This is our Observer concrete class, i.e. all our Subscribers!
 *
 *
 * */
public class SMSUsers implements Observer {

    // This is our instance variable of the Subject, why is this necessary to have this reference?
    // It's necessary to have this reference because we need to know who we are subscribing to!
    // How else would we subscribe to a Subject?
    private final Subject subject;

    // This is the description that gets updated for this SMSUser, comes from our Subject CommentaryObject
    private String desc;

    // Our UserInfo, describes this SMSUser
    private String userInfo;

    /*
    * Our constructor.
    *
    * We need to know at run-time, who are we subscribing to?
    * Who is this user?
    *
    * */
    public SMSUsers(Subject subject, String userInfo) {

        if (subject == null) throw new NullPointerException("No Subject Found");


        this.subject = subject;
        this.userInfo = userInfo;

    }

    @Override
    public void update(String desc) {
        // Specific update method for this SMS user, obviously will be the commentary
        // This commentary is passed down from our CommentaryObject notifyObservers()
        this.desc = desc;
        System.out.println("Hey " + this.userInfo + " here's your commentary update " + this.desc);

    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing this user: " + this.userInfo + " to Subject: " + this.subject);
        this.subject.registerObserver(this);
        System.out.println("Subscribed Successfully.");


    }

    @Override
    public void unsubscribe() {
        System.out.println("Unsubscribing this user: " + this.userInfo + " from Subject: " + this.subject);
        this.subject.removeObserver(this);
        System.out.println("Unsubscribe Successfully.");

    }
}
