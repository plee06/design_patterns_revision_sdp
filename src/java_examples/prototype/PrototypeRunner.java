package java_examples.prototype;

/**
 *
 * test out Prototype design pattern ...
 *
 * */
public class PrototypeRunner {


    // our client interactions ...
    public static void main(String[] args) throws CloneNotSupportedException {

        // first we create a general access control object
        // once access contrl object for everybody. remember how we declared them static ...
        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");

        // cloned here the object was created above
        // "Hey I'm a new User and this is my name, my user level and the type of access control I should have"
        User user = new User("UASER ", "USER Level", userAccessControl);
        System.out.println("*******************");
        System.out.println(user);

        // this already exists and so instead it just returns to us the existing one
        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("USER B", "USER Level", userAccessControl);
        System.out.println("Changing access control of: " + user.getUserName());
        user.getAccessControl().setAccess("READ REPORTS");
        System.out.println(user);
        System.out.println("***************");

        // new access control object created here for MANAGER since it hasn't been created in the program yet
        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("USER C", "MANAGER LEVEL", managerAccessControl);
        System.out.println(user);

        /**
         * so what's happening here?
         *
         * We take advantage of the fact that we can just create an heavy object once and thereafter just clone
         * it, instead of creating a new one every time.
         *
         * We first create the object when the program starts up through our "static block" and then
         * thereafter when we say .getAccessControlObject the control object within our map in
         * AccessControlProvider is just cloned and returned to us so we don't create a new one every time.
         *
         *
         *
         * */
    }
}
