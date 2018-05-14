package command;

/**
 *
 * A concrete Command class for the Email Receiver
 *
 *
 * */
public class EmailJob implements Job {

    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }



    @Override
    public void run() {

        System.out.println("Executing email jobs");

        if (this.email != null) {
            this.email.sendEmail();
        }


    }
}
