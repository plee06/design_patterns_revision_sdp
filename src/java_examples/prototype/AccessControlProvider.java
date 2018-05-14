package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * THis is our Provider class which creates and stores possible Access Control objects in advance
 * and when the client requests the specific AccesControl object instead of creating a brand new one it'll just copy
 * an existing one.
 *
 *
 * */
public class AccessControlProvider {

    // maps strings to our access control objects
    private static Map<String, AccessControl> map = new HashMap<>();

    static {
        System.out.println("Fetching data from external resources and creating access control objects ... ");
        map.put("USER", new AccessControl("USER", "DO_WORK"));
        map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
        map.put("MANAGER", new AccessControl("MANAGER", "GENERATE READ REPORTS"));
        map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
    }

    public static AccessControl getAccessControlObject(String controlLevel) throws CloneNotSupportedException {
        // based on controlLevel that this user has, return a copy of the access control object
        AccessControl ac = null;
        ac = map.get(controlLevel);

        if (ac != null) {
            return ac.clone();
        }
        // else return nu ll
        return null;
    }
}
