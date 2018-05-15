package java_examples.prototype;

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


    // this is the part that creates each prototype only once! static = exists once for the class and no more
    // user,admin,manager, vp are all concrete prototypes that are available which are just cloned
    // when called again by a different user
    static {
        System.out.println("Fetching data from external resources and creating access control objects ... ");
        map.put("USER", new AccessControl("USER", "DO_WORK"));
        map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
        map.put("MANAGER", new AccessControl("MANAGER", "GENERATE READ REPORTS"));
        map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
    }


    // if not null return it, otherwise it doesnt exist and return null
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
