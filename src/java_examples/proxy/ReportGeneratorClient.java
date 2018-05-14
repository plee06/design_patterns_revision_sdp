package proxy;

// This package registers our Object to be able to use the "remote" service
import java.rmi.Naming;


public class ReportGeneratorClient {


    // Our Runner which asks our Remote Client to generate the report and return it to us
    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();

    }


    public void generateReport(){
        // TODO : Generate some report.
    }
}
