package command;

public class LoggingJob implements Job {

    private Logging logging;

    public void setLogging(Logging logging) {
        this.logging = logging;
    }
    @Override
    public void run() {
        System.out.println("RUNNIGN LOGGING JOB");

        if (this.logging != null) {
            this.logging.log();
        }

    }
}
