package command;

public class SmsJob implements Job {

    private Sms sms;

    public void setSms(Sms sms) {
        this.sms = sms;
    }
    @Override
    public void run() {

        System.out.println("RUNNING SMS JOB");
        this.sms.sendSms();

    }
}
