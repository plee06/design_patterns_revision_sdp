package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is our Proxy Interface that will be implemented by a Concrete Remote Implementation
 *
 * It acts as a "proxy" to grab remote information (i.e. another JVM)
 *
 *
 * */
public interface ReportGenerator extends Remote {

    // Defines the "remote" methods that a client can call remotely
    String generateDailyReport() throws RemoteException;

}
