package flyweight;

/**
 * Testing of our "Problem" Flyweight Design Pattern
 *
 *
 * */
public class FlyweightProblemRunner {

    public static void main(String[] args) {
        Platform platform = new JavaPlatform();


        // Some code
        Code userCode = new Code();

        platform.execute(userCode);

        /**
         * Suppose if we had around 2K Users online.
         *
         * Executing their code results in 2,000!!!!! Code objects. That's a lot of Code objects ...
         *
         * Code object is a light object and there SHOULD be one Code object per user. This is okay.
         *
         * What's not okay is the Platform object. The Platform object is very "heavy" in that it takes up a lot
         * of memory space (imagine it!). Creating too many Platform objects is time consuming and heavy.
         *
         * We need to be able to control the Platform object to only be created when a new one is actually
         * needed.
         *
         * In this example, we create a new Platform Object everytime someone writes a bit of code!
         *
         * We can just have one Platform object for a bunch of related Code.
         *
         * Why is this so? In our Platform object we directly pass in the userCode and so for a specific overall
         * "program" imagine this main is a program, each programmer needs their Code object and then a specific
         * independent Platform object to execute their code on.
         *
         * Enter flyweight pattern!
         *
         *
         * */
    }
}
