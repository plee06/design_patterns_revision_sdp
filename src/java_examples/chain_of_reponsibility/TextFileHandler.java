package chain_of_reponsibility;



/**
 * Our Concrete Handler that only can process text files
 *
 *
 * */

public class TextFileHandler implements Handler {

    // This is the Handler it'll delegate to if it can't process the Text
    // This "chain" is decided at run time... can vary on company
    private Handler handler;
    private String handlerName;

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }


    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("text")) {
            System.out.println("handling the text file");
        } else if (handler != null) {
            System.out.println("I can't handle this so I'm passing it off to: " + this.handler.getHandlerName());
            // attempt to process by delegation
            this.handler.process(file);
        } else {
            System.out.println("file not supported");
        }

    }

    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}
