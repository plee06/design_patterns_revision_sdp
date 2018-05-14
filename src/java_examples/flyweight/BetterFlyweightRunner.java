package flyweight;

/**
 * Runner for our flyweight pattern
 *
 *
 *
 * */
public class BetterFlyweightRunner {

    public static void main(String[] args) {
        // Create some client code
        Code code = new Code();

        // set this code to be C
        code.setCode("C Code...");

        // Platform call of getInstance, important to note here that this object only get's an existing
        // object if it already exists in the map, otherwise it's created! That's what our getPlatformInstance
        // method is doing remember!
        Platform platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);

        System.out.println("==========NEW PROGRAM====================");
        // because we had C code we get the platformInstance of C and then execute it appropriately

        // now suppose our client has another C code created
        // now instead of creating a whole nother platform instance we can just pass it into the same
        // existing platform object
        Code code2 = new Code();
        code2.setCode("More C Code");
        platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code2);

        System.out.println("===========NEW PROGRAM===================");
        // now suppose we get some Java code, NOW we create an instance because it doesn't exist yet!
        Code code3 = new Code();
        code3.setCode("Java Code");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code3);
        System.out.println("============NEW PROGRAM==================");

        /**
         * As we can see the Object is only created once, every time after that it's just retrieved from our map
         * which has the existing instantiation, saved memory!
         *
         * So unlike before where we created a new Platform Object for everysingle Code object i.e.
         * 2000 Code Objects = 2000 Heavy Platform Objects
         *
         * we get 2000 Code Objects and only 4 Heavy Platform Objects!!!
         *
         * */
    }
}
