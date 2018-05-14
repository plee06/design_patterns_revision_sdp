package java_examples.builder;

/**
 * This is our Product class which contains the most important components of the Car
 * that are required to complete the car object!
 *
 *
 * */
public class Car {

    /*
    * These are the NECESSARY instance variables that EVERY Car must have
    *
    * */
    private String bodyStyle;
    private String power;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private String carType;

    /*
    * Our Car Constructor which takes in the specific carType
    *
    * */
    public Car (String carType) {
        this.carType = carType;
    }

    String getBodyStyle() {
        return this.bodyStyle;
    }
    void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }
    String getPower() {
        return this.power;
    }
    void setPower(String power) {
        this.power = power;
    }
    String getEngine() {
        return this.engine;
    }
    void setEngine(String engine) {
        this.engine = engine;
    }
    String getBreaks() {
        return this.breaks;
    }
    void setBreaks(String breaks) {
        this.breaks = breaks;
    }
    String getWindows() {
        return this.windows;
    }
    String getSeats() {
        return this.seats;
    }
    void setSeats(String seats) {
        this.seats = seats;
    }
    void setWindows(String windows) {
        this.windows = windows;
    }
    String getFuelType() {
        return this.fuelType = fuelType;
    }
    void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Override toString method to provide appropriate String representation of the Car
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("================" + this.carType + "=================\n");
        sb.append(" BODY: ");
        sb.append(this.bodyStyle);
        sb.append(" \n POWER: ");
        sb.append(this.power);
        sb.append(" \n ENGINE: ");
        sb.append(this.engine);
        sb.append("\n BREAKS: ");
        sb.append(this.breaks);
        sb.append("\n SEATS: ");
        sb.append(this.seats);
        sb.append("\n WINDOWS: ");
        sb.append(this.windows);
        sb.append("\n FUELTYPE: ");
        sb.append(this.fuelType);

        return sb.toString();

    }
}
