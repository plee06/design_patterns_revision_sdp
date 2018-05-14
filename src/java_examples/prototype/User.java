package prototype;

/**
 * This is the  class that all our users have instantiated, our User objects!
 *
 * Each User object has their own AccessControl object
 *
 *
 * */
public class User {

    private String userName;
    private String level;
    private AccessControl accessControl;


    public User(String userName, String level, AccessControl accessControl) {
        this.userName = userName;
        this.level = level;
        this.accessControl = accessControl;
    }

    String getUserName() {
        return this.userName;
    }
    String getLevel() {
        return this.level;
    }
    void setUserName(String userName) {
        this.userName = userName;
    }
    void setLevel(String level) {
        this.level = level;
    }


    public AccessControl getAccessControl() {
        return this.accessControl;
    }
    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }


    @Override
    public String toString() {
        return "Name: " + userName + ", Level: " + level + ", Access Control Level: " + accessControl.getControlLevel()
                + ", Access: " + accessControl.getAccess();
    }
}
