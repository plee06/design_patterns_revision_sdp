package chain_of_reponsibility;

/**
 * Test Runner for our Chain of Responsibility Pattern
 *
 *
 * */
public class CoRRunner {

    public static void main(String[] args) {
        File file = null;
        // First create all our Handlers, we can of course have more but for time saving ...
        Handler txtHandler = new TextFileHandler("Text File Handler");
        Handler audio = new AudioFileHandler("Audio File Handler");

        // Set up the delegation chain of responsibilities

        // set it up so txt delegates to audio, audio has no one to delegate to. This can chain
        // try longer CoR later when we have more time
        // this is our main entry point into the chain
        txtHandler.setHandler(audio);


                // Now create our files

        // this'll be processed by text

        file = new File("I'm a text file", "text", "some path here");
        // attempt processing
        txtHandler.process(file);
        System.out.println();
        // this'll be processed by audio
        file = new File("I'm an audio file", "audio", "some path here");
        txtHandler.process(file);
        System.out.println();
        // this'll return a  cannot process
        file = new File("I'm an mp3 file", "mp3", "some path here");
        txtHandler.process(file);
    }





}
