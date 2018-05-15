package java_examples.singleton;

/*
* This attempts to solve the problem represented in the SingletonEager class where the Singleton is
* created at runtime because of how static works with the JVM
*
* */
public class SingeltonLazy {

    // In this lazy pattern, we only create the Singleton Object if it is called upon, otherwise it stays null
    private static SingeltonLazy sl = null;

    private SingeltonLazy() {}

    /*
    * So we create it on first call, and then just return it on successive calls!
    *
    * */
    public static SingeltonLazy getInstance() {

        if (sl == null) {
            sl = new SingeltonLazy();
        }

        return sl;
    }

    // But, this can cause problems when it comes to multi-threading, consider thread1, interrupt, thread2, create,
    // thread1 come back and create. Todo in Multithreading!
}
