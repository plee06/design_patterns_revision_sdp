package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution to our problem!
 *
 * We provide a platform factory class which controls the creation of Platform objects. i.e. only
 * create one when it's needed, otherwise don't create it and just pass the existing instance to our client.
 *
 * Builds upon that whole idea of "lazy loading" ... please see Singleton pattern for more details
 * or the Virtual Proxy!
 *
 *
 * */
public class PlatformFactory {

    // This is our static Map which is available in our entire program to be accessed which contains
    // all the already instantiated platforms <String, Platform>
    private static Map<String, Platform> map = new HashMap<>();

    // We have a private constructor here to prevent the Factory from being instantiated
    // Why? We have static methods and so the methods can be called with Class name, we don't ever actually
    // want a Factory object to be created!!!!! Takes up memory space. Let's save memory space!!!
    private PlatformFactory() {
        throw new AssertionError("Cannot instantiate this class");
    }

    // We only have one static method here which is the getPlatformInstance
    /*
    * The client will request from us the platformType that they want and we do the following:
    *
    * */
    // synchronized keyword -> thread safety -> look deeper into later
    public static synchronized Platform getPlatformInstance(String platformType) {
        // First try grabbing it from our map, if it exists we'll get back a platform and we will
        // skip over the conditional and just return it
        Platform platform = map.get(platformType);

        // otherwise, if that platform hasn't yet been instantiated we go into a switch statement
        if (platform == null) {
            /*
            * within this switch statement we check the platformType the client passed in with every case we have
            * we have four cases: "C", "CPP", "JAVA", "RUBY" and each one of these will instantiate it's appropriate
            * platform.
            *
            * Once instantiated it'll put it into the map for future references so it doesn't get instantiated
            * again, i.e. "one shared object"
            *
            * */
            switch(platformType) {
                case "C" : platform = new CPlatform();
                    break;
                case "CPP" : platform = new CPPPlatform();
                    break;
                case "JAVA" : platform = new JavaPlatform();
                    break;
                case "RUBY" : platform = new RubyPlatform();
                    break;


            }
            map.put(platformType, platform);
        }
        return platform;

        // in this example the shared objects have no "shared intrinsic property" i.e. no property within the objects
        // that our "code" objects will use. The only thing is that it has a "extrinsic" property with the code object
        // that is passed into our platforms given by the client code
    }
}
