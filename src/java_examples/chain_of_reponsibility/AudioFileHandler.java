package chain_of_reponsibility;

/*
* this is our audio file handler that can only process audio files!
*
*
* */

public class AudioFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public AudioFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;

    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("audio")) {
            System.out.println("processing the audio file");
        } else if (this.handler != null) {
            System.out.println("I can't process this so I'm passing it along the chain ...");
            this.handler.process(file);
        } else {
            System.out.println("wrong type of file cannot process these types");
        }

    }

    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}
