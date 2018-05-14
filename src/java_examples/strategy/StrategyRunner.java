package strategy;

/*
* Runner of our Strategy pattern
*
*
* **/
public class StrategyRunner {

    public static void main(String[] args) {
        // first we instantiate a specific Strategy object
        TextFormatter formatter = new CapTextFormatter();

        // afterwards we create our context object which gets passed in the strategy object
        TextEditor editor = new TextEditor(formatter);
        // currently our Context object of editor has the Strategy object of CapTextFormatter() ...
        editor.publishText("testing Cap TEXT FORMATTER!");

        // now lets say we want to change Strategies, we swap the CapTextFormatter for the LowerCase !
        formatter = new LowerTextFormatter();

        // now pass it into our context object
        editor = new TextEditor(formatter);
        editor.publishText("TEST LOWER CASE!!!");


        /**
         * so whats going on?
         *
         * we create a bunch of Strategy objects that implement some Strategy super interface.
         *
         * We then have a Context object (our TextEditor) in this case which is composed of the Strategy objects
         * (i.e. context of the Super interface) which allows us to run specific methods in different contexts
         * based on the Strategy we pass in.
         * Basically we abstract out a family of algorithms (the text formatting) into separate objects which allows
         * us to just "swap" in strategy objects instead of creating some kind of super object with a bunch of methods
         * and conditionals in it.
         *
         * Main advantage of this pattern?
         * Think about future cahnges, adding and removing algorithms is quite easy and does not affect our client
         * code or context objects!! Promotes the whole "code to interface" design principle.
         *
         *
         * */
    }
}
