package java_examples.builder;

import java.util.Date;

/**
 * The Builder Pattern can also take another form .. consider a Form * no pun intended with a bunch of properties
 * to be set. The majority of these fields are optional, only firstName, lastName, userName and password are
 * required.
 *
 * */
public class Form {

    /*
    * The required instance variables
    *
    * */
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    /*
    * Not really required ...
    *
    * */
    private String address;
    private Date dob;


    // The question here becomes: What kind of Constructor do we use?

    /*
    * Do we just initialize with the required fields and then have methods later?
    *
    * Do we just build up a ton of different Constructors?
    *
    * The solution: "Telescoping Constructors" -> Provide a constructor with only the required parameters
    * and then another with a single optional, two single optionals, three...so on.
    *
    * Culminating in the final result of a constructor with all optional the optional parameters!
    *
    * */

    // Example of Telescoping Constructors:

    // our first Constructor with the REQUIRED PARAMTERS! This is one example ... kind of lengthy

    /*
    * What's going on here?
    *
    * the this() keyword is calling the next constructor in the same class. i.e. this class.
    *
    * for example in Form(String firstName, String lastName) { this(... null, null) } is calling the next
    * constructor and building up the object with the values of userName and password set to null.
    *
    * The idea is the same for this(....password, null, null) call in which it calls the next cosntructor
    * down with address and dob values as null.
    *
    * The idea here is the "telescoping" idea in which we set "optional" parameters by taking advantage of the
    * explicit constructor call with this() within constructors of Java!
    *
    * */
    public Form(String firstName, String lastName) {
        this(firstName, lastName, null, null);
    }
    public Form(String firstName, String lastName, String userName, String password) {
        this(firstName, lastName, userName, password, null, null);
    }
    public Form(String firstName, String lastName, String userName, String password, String address, Date dob) {
        System.out.println("The last Constructor with all parameters set ... ");
    }
    /**
     * This Telescoping Constructor pattern works but it's difficult to write Client code when there are many parameters
     * I mean can you imagine this if we like 30 different fields to set?
     *
     * And even YOU did write it, can you imagine the Client user using this Class and having to read over
     * every property and knowing what to do? Imagine a client reversing the parameters and that Constructor
     * not existing which then throws a Compiler error ...
     *
     *
     * A Second alternative exists: JavaBean pattern -> create paramterless no -args constructor.
     *
     * Creates an empty object and then you "set props" through method calls (setters)
     * -> But this kind of relies on Client to do it right, there is no "checking" where as above at least
     * we had compiler time errors thrown. Here the client can set whatever they want appropriately!
     *
     * Third Alternative Exists using the Builder Pattern ->
     * Instead of making the desired Object directly i.e. this Form, the client can call a constructor
     * with all of the required parameters (i.e. they want) and they get a builder object.
     *
     * Then the client can call setter-like methods on the builder object to set each optional parameter
     * of interest.
     * Finally client calls a parameterless build method to generate the object.
     *
     *
     * */

}
