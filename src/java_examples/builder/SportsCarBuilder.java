package java_examples.builder;

public class SportsCarBuilder implements CarBuilder {

    private final Car car = new Car("SPORTS CAR");


    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("SPORTS CAR STYLE");


    }

    @Override
    public void buildPower() {
        car.setPower("SPORTS CAR POWER");

    }

    @Override
    public void buildEngine() {
        car.setEngine("SPORTS CAR ENGINE");

    }

    @Override
    public void buildBreaks() {
        car.setBreaks("SPORTS CAR BREAKS");

    }

    @Override
    public void buildSeats() {
        car.setSeats("SPORTS CAR SEATS");

    }

    @Override
    public void buildWindows() {
        car.setWindows("SPORTS CAR WINDOWS");

    }

    @Override
    public void buildFuelType() {
        car.setFuelType("SPORTS CAR FUEL TYPE");

    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
