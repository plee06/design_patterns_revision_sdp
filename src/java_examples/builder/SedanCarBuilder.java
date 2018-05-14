package java_examples.builder;

public class SedanCarBuilder implements CarBuilder {

    // Object composition here which is a reference to the Car Object which is built here
    // and then customized here within the Builder object
    private final Car car = new Car("SEDAN");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("SEDAN BUILD STYLE HERE");
    }

    @Override
    public void buildPower() {
        car.setPower("SEDAN POWER HERE");

    }

    @Override
    public void buildEngine() {
        car.setEngine("SEDAN ENGINE HERE");

    }

    @Override
    public void buildBreaks() {
        car.setBreaks("SEDAN BREAKS");

    }

    @Override
    public void buildSeats() {
        car.setSeats("SEDAN SEATS");

    }

    @Override
    public void buildWindows() {
        car.setWindows("SEDAN WINDOWS HERE");

    }

    @Override
    public void buildFuelType() {
        car.setFuelType("SEDAN FUEL HERE");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
