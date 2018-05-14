package facade;

public class ScheduleServer {


    /*
    * Server Start Methods
    *
    * */
    public void startBooting() {
        System.out.println("Booting...");
    };
    public void readSystemConfigFile() {
        System.out.println("Reading System Config Files...");
    };
    public void init() {
        System.out.println("Init...");
    };
    public void initializeContext() {
        System.out.println("Initializing Context...");
    };
    public void initializeListeners() {
        System.out.println("Initializing Listeners...");
    };
    public void createSystemObjects() {
        System.out.println("Creating System Objects...");
    };

    /*
    * Server Stop methods
    *
    * */
    public void releaseProcesses() {
        System.out.println("Releasing Processes....");
    };
    public void destroy() {
        System.out.println("Destroying...");
    };
    public void destroySystemObjects() {
        System.out.println("Destroying System Objects...");
    };
    public void destroyListeners() {
        System.out.println("Destroying Listeners...");
    };
    public void destroyContext() {
        System.out.println("Destroying Context...");
    };
    public void shutdown() {
        System.out.println("SHUTDOWN!");
    };
}
