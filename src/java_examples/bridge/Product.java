package bridge;

/*
* Our Product Interface in the Bridge Pattern, all concrete implementations will subclass this Interface
*
*
* */
public interface Product {

    /*
    * Methods that must be implemented
    *
    * */

    // Returns the product name
    public String productName();

    // Produce method which is used by concrete implementations to produce the Locking mechanism
    public void produce();
}
