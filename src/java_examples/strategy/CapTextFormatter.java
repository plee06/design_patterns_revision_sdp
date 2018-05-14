package strategy;

/**
 * Our concrete Strategy Object here
 *
 *
 * */
public class CapTextFormatter implements TextFormatter {

    // Changes the text into a Capital upper case ...
    @Override
    public void format(String text) {
        System.out.println("[CaoTextFormatter]: " + text.toUpperCase());
    }
}
