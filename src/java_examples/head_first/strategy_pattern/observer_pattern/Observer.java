package head_first.strategy_pattern.observer_pattern;


/*
* This is the Observer interface which all Observers of the Weather app must implement.
*
* */

public interface Observer {


    // All Observers will have one method, and that is update to update it's display on weather changes
    public void update(float temp, float pressure, float humidity);


}
