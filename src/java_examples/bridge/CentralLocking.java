package bridge;

/**
 * This is our concrete implementer which are used to then implement the concrete product implementations
 *
 *
 * */
public class CentralLocking implements Product {

    private final String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }


    @Override
    public String productName() {
        return this.productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");

    }
}
