package bridge;

public class BridgePatternRunner {

    /**
     * Okay so what exactly did we do here?
     *
     * We created a bridge between our abstraction that handles the Car's i.e. the different clients that come to us
     * for our security systems and the abstraction that creates our products to give to the clients. Here, the Product
     * interface.
     *
     * Originally, we had one Super abstract class which handled all of the details of both producing the Product
     * and assembling the product. Each company that came to us we extended from our main Super abstract class, but
     * eventually this was getting overwhelming in the fact that we were tightly coupling through inheritance
     * i.e. if we wanted to create a separate product or add functionality to some product all the subclasses
     * would inherit it even if they didn't want it.
     *
     * And so our solution here was to decouple the Companies that came to use (clients) to a specific Car interface
     * which handled them with Object composition.
     *
     * And so each Car class instantiation created a new Locking system for them specifically, this was possible
     * because Car had an Object of type Product within it (object composition) which allowed us to
     * set a product for each new Client and then produce it appropriately to them.
     *
     * If we had done it with the original super abstract class idea then we would've had to instantiate a new
     * subclass which directly extended from the superclass to then tailor in each method to them specifically.
     *
     * Here we just use object composition to pass in the type of Product they want and then produce it for their
     * specific car type.
     *
     *
     * */
    public static void main(String[] args) {
        Product clProduct = new CentralLocking("Central Locking System");
        Product glProduct = new GearLocking("Gear Locking System");

        Car car = new BigWheel(clProduct, "BigWheel xz Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car  = new BigWheel(glProduct, "BigWheel xz Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Moroten(clProduct, "Moroten lm Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        // ...

    }
}
