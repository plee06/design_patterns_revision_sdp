package java_examples.singleton;

/*
* Here we take advantage of the keyword 'static' in Java. As we know, when we declare a variable as static
* only ONE instance of that variable is created.
*
* See below for possible "problem"
*
* */
public class SingletonEager {


    // As far as the client code is using this sc static variable everything is fine.
    // public static SingletonEager sc = new SingletonEager();

    // However, if the client uses a new operator there would be a new instance of this class.

    /*
    * We can stop the SingletonEager class from being instantiated by using Private. Remember, Singleton
    * is just one Object, even though SingletonEager sc is just ONE object because it's static, creating
    * a new SingletonEager object defeats that "one object" only thing.
    *
    * To beat this, we create a private constructor to prevent any outside instantiations of this Class
    *
    * */

    // public static SingletonEager sc = new SingletonEager();
    // private SingletonEager() {}

    // Now we've made it so that the sc Object can only be reached through the static variable, this class itself
    // can no longer be instantiated

    // But the above is still bad because we give direct access to our member which isn't good, so we can modify that


    /*
    *  We can modify that by creating a static method to return the instance and make the sc variable private
    *
    *
    * */
    private static SingletonEager sc = new SingletonEager();
    private SingletonEager() {};

    public static SingletonEager getInstance() {
        return sc;
    }

    // This now successfully creates a Singleton based on different "encapsulation" principles

    // Even with several requests, during the whole life time of this program, only this single instance is available

    // But there's a problem wit this, what is it?

    /*
    * WELL!
    *
    * With the JVM, all Static variables are created at run-time, that means this Singleton is created the MOMENT
    * that the JVM starts up.
    *
    * If we never need to use the Singleton, that's just wasted space in memory right? And we do not want to waste
    * precious memory space!
    *
    * The best approach is to always only create an Object when it's needed, no important space wasted
    *
    * */

}
