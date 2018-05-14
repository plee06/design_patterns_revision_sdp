package java_examples.builder;

/**
 * Our CarBuilder interface which contains the set of common methods used to build
 * the car object and its various components!
 *
 * This is the common interface which all Cars in the future need to implement. These are the general methods
 * that every Car should have ...
 *
 *
 * */
public interface CarBuilder {

    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();

    // Returns the final Car object to the client after construction
    public Car getCar();

}
