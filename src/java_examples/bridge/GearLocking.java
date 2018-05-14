package bridge;

/**
 * Our other concrete locking system class which implements Product.
 *
 *
 * */
public class GearLocking implements Product {

    private final String productName;

    public GearLocking(String productName) {
        this.productName = productName;
    }


    @Override
    public String productName() {
        return this.productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }
}
