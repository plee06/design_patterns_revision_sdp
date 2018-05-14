package facade;


public class TestFacadeRunner {

    public static void main(String[] args) {

        // This is the original ScheduleServer Object our clients had to work with, with a bunch of complicated code!
        ScheduleServer ss = new ScheduleServer();

        // We now provide an awesome Facade object to simplify life
        // Which uses Object composition to store their original object of ScheduleServer, call everything in our
        // facade which handles the bulk of the work!
        ScheduleServerFacade ssf = new ScheduleServerFacade(ss);

        System.out.println("Isn't life so much easier now? \n");
        ssf.startServer();
        ssf.stopServer();

        /*
        * Important: we do not encapsulate anything, we just provide a layer to decomplicate things! Clients still
        * have access to the complicated part if they want ...
        *
        * */
    }
/**
 * This is an example of the original code our clients had to write to run our Interface code
 * and work with our ScheduleServer product!
 *
 * ScheduleServer scheduleServer = new ScheduleServer();
 *
 * scheduleServer.startBooting();
 * scheduleServer.readSystemConfigFile();
 * scheduleServer.init();
 * scheduleServer.initializeContext();
 * scheduleServer.initializeListeners();
 * scheduleServer.createSystemObjects();
 *
 *
 * System.out.println("Start work....");
 * System.out.println("End work...");
 *
 *
 * To then stop the server:
 *
 * scheduleServer.releaseProcesses();
 * scheduleServer.destroy();
 * scheduleServer.destroySystemObjects();
 * scheduleServer.destroyContext();
 * scheduleServer.shutdown();
 *
 * Phew! That's a lot of code. I can understand why our clients don't want this and instead want a Facade ....
 * some simpler interface to work with our Server
 *
 * */


}


