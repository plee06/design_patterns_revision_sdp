package java_examples.bridge;

// moroten is a client that wants a locking system
public class Moroten extends Car {

    // composed of the type of product and cartype that it is
    private final Product product;
    private final String carType;

    public Moroten(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }


    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName() + " for " + this.carType);

    }

    @Override
    public void produceProduct() {
        System.out.println("Modifying " + product.productName() + " according to " + this.carType);

    }
}
