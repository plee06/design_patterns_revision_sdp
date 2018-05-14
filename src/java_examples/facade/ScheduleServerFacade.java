package facade;

/**
 * This is our ScheduleServerFacade which will Simplify our current Interface given to clients whom are
 * complaining that our Interface right now is too complex! They want something simplified to work with.
 *
 * To resolve that crazy complex ScheduleServer Interface which our clients dislike, we'll create this Facade
 * class to wrap up our ScheduleServer Object and simplify the amount our clients need to work with. Capeche?
 *
 *
 * */
public class ScheduleServerFacade {

    // Object Composition which wraps up our ScheduleServer object
    private final ScheduleServer scheduleServer;

    // Constructor which takes in the original client ScheduleServer Object and wraps it up here! Hello, Object Composition
    public ScheduleServerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    /*
    * These two methods below perform that oh so complicated stuff that our clients didn't like. Now our clients
    * only have to deal with two methods instead of like, what, 100?
    *
    * */

    // Methods that Start the Server, we simplify the start by just wrapping up all the methods in this one method!
    public void startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();

    }

    // Stop server methods encapsulated into one method
    public void stopServer() {
        scheduleServer.releaseProcesses();
        scheduleServer.destroy();
        scheduleServer.destroySystemObjects();
        scheduleServer.destroyListeners();
        scheduleServer.destroyContext();
        scheduleServer.shutdown();

    }

}
