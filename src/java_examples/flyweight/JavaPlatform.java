package flyweight;

/**
 *
 * Revealing the problem. This is our specific Platform that is Java Specific.
 *
 * We pass in the code here and then it executes it (only compiles if of type Java) -> Also use the CoR?
 *
 * */
public class JavaPlatform implements Platform {

    public JavaPlatform() {
        System.out.println("JavaPlatform has been Created");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing the Java code");

    }
}
