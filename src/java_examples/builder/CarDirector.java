package java_examples.builder;

/**
 * The Director class is what is directly exposed to the Client and what the Client works with
 *
 *
 * */
public class CarDirector {

    // composed of CarBuilder
    private CarBuilder carBuilder;

    // upon construction it will be composed of the type of CarBuilder constructor needed i.e. Sedan or Ford etc.
    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;

    }

    // then the appropriate build constructions are assigned through this reference
    // which refers to the type of car we want to build that we passed in through construction
    void build() {

        this.carBuilder.buildBodyStyle();
        this.carBuilder.buildBreaks();
        this.carBuilder.buildEngine();
        this.carBuilder.buildFuelType();
        this.carBuilder.buildPower();
        this.carBuilder.buildSeats();
        this.carBuilder.buildWindows();
    }
}
