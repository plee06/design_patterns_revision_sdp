package command;

public class FileIOJob implements Job {

    private FileIO fileIO;

    public void setFileIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }


    @Override
    public void run() {
        System.out.println("RUNNING FILE IO JOB");

        if (this.fileIO != null) {
            this.fileIO.execute();
        }

    }
}
