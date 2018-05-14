package mediator;

/**
 * This Sensor class is used by the heater to check the temperature
 *
 *
 * */
public class Sensor {

    boolean checkTemperature(int temp) {
        System.out.println("Temperature has reached " + temp);
        return true;
    }
}
