package strategy;

/**
 *
 * this is our Concrete Context object which is composed of our Strategy object through the super interface
 * so it can switch out the various Strategy obejcts when needed
 *
 * */
public class TextEditor {

    private final TextFormatter textFormatter;

    // the Strategy object is set on construction of this Class
    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        textFormatter.format(text);

    }
}
