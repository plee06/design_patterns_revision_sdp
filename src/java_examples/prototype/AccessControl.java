package prototype;

/**
 * This is our actual AccessControl Object which implements Prototype, it's constructed by setting a specific
 * controlLevel and access level.
 *
 *
 *
 * */
public class AccessControl implements Prototype {

    private final String controlLevel;
    private String access;

    // constructor
    public AccessControl(String controlLevel, String access) {
        this.controlLevel = controlLevel;
        this.access = access;
    }

    /**
     * This method will call the clone method of the super class and return the object after down-casting it to
     * our AccessControl type
     *
     *
     * */
    @Override
    public AccessControl clone() throws CloneNotSupportedException {
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException ce) {
            ce.printStackTrace();
        }

        return null;

    }

    public String getControlLevel() {
        return this.controlLevel;
    }
    public String getAccess() {
        return this.access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
