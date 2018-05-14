package observer;

/**
 * This is our abstraction; interface for the Commentary object! Just good practice to separate out a blueprint,
 * i.e. make the abstraction to have concrete implementations implement it. Makes all future commenter objects conform
 * in a "unary" manner! Woo hoo
 *
 * OOP principle: Follow me because I don't want all you commenter objects doing your own thing when it comes to these
 * things I declare
 *
 * */
public interface Commentary {

    /*
    * Set the description of the commentary
    *
    * */
    void setDesc(String desc);

}
