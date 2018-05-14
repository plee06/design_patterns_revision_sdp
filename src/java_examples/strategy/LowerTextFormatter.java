package strategy;

/**
 * another concrete Strategy object ...
 *
 *
 * */
public class LowerTextFormatter implements TextFormatter {

    // changes text to lower case !
    @Override
    public void format(String text) {
        System.out.println("[Lower Text Formatter]: " + text.toLowerCase());

    }
}
