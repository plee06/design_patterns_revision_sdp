package template;

/**
 * Our template for database connections. This template is provided for all subclasses that
 * use this skeleton in order to make the connections easier for each type of connection ...
 * no need for a bunch of repeat code, just slight tweaks to the existing algorithm template.
 *
 *
 *
 * */
public abstract class ConnectionTemplate {

    /**
     * In our connection template we implement here all but the following:
     *
     * setDBDriver()
     * setCredentials()
     * and
     * setData()
     *
     * these are left to the specific type of DB connections to be implemented.
     *
     * All steps required to get the work done is put here but the implementations must be finished in specific
     * DB connection types ...
     *
     *
     * the run * method here is final as is the method to run these steps in order and should not be changed ...
     *
     *
     * */
    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }

    public abstract void setDBDriver();
    public abstract void setCredentials();

    void connect() {
        System.out.println("Setting connection ...");
    }
    void prepareStatement() {
        System.out.println("Preparing insert statement....");
    }


    public abstract void setData();

    public void insert() {
        System.out.println("Inserting data ... ");

    }
    public void close() {
        System.out.println("Closing connections ... ");
    }
    public void destroy() {
        System.out.println("Destroying connection objects ... ");
    }

}
