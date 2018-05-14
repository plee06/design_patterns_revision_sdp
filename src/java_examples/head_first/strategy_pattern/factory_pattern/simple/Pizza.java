package head_first.strategy_pattern.factory_pattern.simple;

/**
 * Defines our actual Product in the Factory pattern. i.e. think of our actual Pizza product that is returned to the
 * Pizza store!
 *
 * */
public class Pizza {


    public Pizza()
    {

    }

    void prepare()
    {
        System.out.println("I'm preparing the pizza by putting together some dough and shit.");
    }

    void bake()
    {
        System.out.println("...and now I'm baking it. But I don't know how to bake ... oh well?");
    }

    void cut()
    {
        System.out.println("BUT I KNOW HOW TO CUT, SWISH SLASH. Is it even swish slash?");
    }

    void box()
    {
        System.out.println("SOMEONE GIVE ME A BOX, QUICK, BOX! WHERE THE (@*#(# IS THAT BOX?");
        System.out.println("On a side note, did I really just censor myself in IntelliJ...?");
    }
}
