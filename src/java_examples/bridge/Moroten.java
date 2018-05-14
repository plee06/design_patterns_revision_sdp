package bridge;

public class Moroten extends Car {

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
