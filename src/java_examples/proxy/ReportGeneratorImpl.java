package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the Object that does all the real work.
 *
 * It is our remote implementation. THe UnicastRemoteObject is what makes it work remotely.
 *
 * There is a lot of things going on behind the scenes, but we just need the high level overview.. come back if
 * you have time.
 *
 *
 * */
public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {
    private static final long serialVersionUID = 301921309L;

    protected ReportGeneratorImpl() throws RemoteException {};

    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();

        sb.append("This is some report .... ");

        return sb.toString();
    }
}
