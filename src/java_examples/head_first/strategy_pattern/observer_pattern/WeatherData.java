package head_first.strategy_pattern.observer_pattern;

import java.util.ArrayList;

/*
* This is our WeatherData Class, i.e. it's the Object that changes and notifies our Observers in the Observer pattern.
*
* It's the Subject Object!
*
* */
public class WeatherData implements Subject {

    // Instance variables

    // A List of all Observers that are dependent on this Subject, i.e. relies on it for notifications
    private ArrayList<Observer> observers;

    // The changing components of the Weather Data that constantly get updated based on some imaginary database
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData()
    {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o)
    {
        // Add the observer to the list of the Observers
        this.observers.add(o);


    }

    @Override
    public void removeObserver(Observer o)
    {
        // Remove a specific observer from the list of observers, i.e. unsubscribe them!
        this.observers.remove(o);

    }

    @Override
    public void notifyObservers()
    {
        // This method will notify all the observers of updates based on weather changes, we need to notify all
        // the observers in our ArrayList
        for (Observer ob : this.observers)
        {
            // For each observer in the list of observers, run the appropriate update method!
            ob.update(temperature, pressure, humidity);
        }
    }

    // This is the method (default) provided to us by the company that notifies us that measurements have changed
    public void measurementsChanged()
    {
        // When this gets run by some other class i.e. when the measurements change, let's notify our observers!
        notifyObservers();
    }

    // This method is to "simulate" the weather updates
    public void setMeasurements(float t, float p, float h)
    {
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;

        // And after this "simulation" of a weather change, run the measurementsChanged method, pretend like this
        // exists somewhere else and measurementsChanged() is being called from somewhere else!
        measurementsChanged();
    }
}
