package chain_of_reponsibility;

/**
 * Our Handler interface. Defines basic methods that a Handler should have
 *
 *
 * */
public interface Handler {

    // This method sets the next handler in the chain, i.e. if I can't process it move it to this next guy
    void setHandler(Handler handler);
    // Does the actual processing or at least attempts to
    void process(File file);
    // Returns handler who is handling ...
    String getHandlerName();


}
