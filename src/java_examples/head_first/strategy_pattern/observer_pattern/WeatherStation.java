package head_first.strategy_pattern.observer_pattern;


/*
* Our WeatherStation Class
*
* */
public class WeatherStation {

    public static void main(String[] args) {
        // Create the WeatherData Object, this is the Subject
        WeatherData wd = new WeatherData();

        // Add all of our Observers that rely on the Subject of WeatherData.
        // These wait for notifications based on weather updates
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);

        // Simulations of the "updating of weather" ... this would normally be a db somewhere sending updates!
        wd.setMeasurements(23.1f, 12.0f, 19.0f);
        wd.setMeasurements(23.1f, 12.0f, 19.0f);
        wd.setMeasurements(23.1f, 12.0f, 19.0f);

        // Updates should happen three times, i.e. print out ccd three times!
    }
}
