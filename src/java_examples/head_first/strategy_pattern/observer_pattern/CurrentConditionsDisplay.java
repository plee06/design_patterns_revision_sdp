package head_first.strategy_pattern.observer_pattern;

/*
* Simulation of the "Observer" object of CurrentConditions
*
*
* Implements our Observer interface and DisplayElements Interface.
*
* By the implementation of those two interfaces, our Subject of WeatherData can notify the observers without knowing
* exactly who they are or what they do. It just needs to know that they implement Observable and DisplayElements.
* Which is implicitly checked when we register them because we have to pass in something of Observer type interface!
*
*
* */
public class CurrentConditionsDisplay implements Observer, DisplayElements {

    // Instance Variables
    private float temperature;
    private float humidity;

    // This is necessary so we can register our Observer with the Subject and accordingly get the notifications
    private Subject weatherData;

    /*
    * Our Constructor for the CurrentConditions Display!
    *
    * Passes in the weatherData Subject so we can register with it!
    * */
    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    /**
     * The display method that displays the updated weather
     *
     * */
    @Override
    public void display()
    {
        System.out.printf("The weather temperature is: %f and the humidity is: %f \n", temperature, humidity);

    }

    @Override
    public void update(float temp, float pressure, float humidity)
    {
        // Update our instance variables here to display accordingly
        this.temperature = temperature;
        this.humidity = humidity;
        display(); // Run display once we've updated

    }
}
