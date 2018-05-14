package bridge;

/*
* This is our abstraction of the Car class, this holds a reference to the product interface and
* carType.
*
*
* */
public abstract class Car {

    /*
    * Our abstract car class holds two instance variables.
    *
    * One for the Object composition for the type of product that this Car receives
    * And the other is the carType of that product
    *
    * */
    private final Product product;
    private final String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    /*
    * Two abstract methods are declared to be implemented in our Car concrete implementations
    *
    * */
    public abstract void assemble();
    public abstract void produceProduct();

    /*
    * Prints details of this Car concrete implementation (later subclassed)
    *
    * */
    public void printDetails() {
        System.out.println("Car: " + carType + ", Product: " + product.productName());
    }
}
