package mediator;

/**
 * Just one of the many different Software programs for the Washing Machine!
 *
 * */
public class CottonMachine implements MachineMediator {
    private final Machine machine;
    private final Button button;
    private final Valve valve;
    private final Motor motor;
    private final Heater heater;

    // CottonMachine has it's own Sensor and SoilRemoval, it's special to this implementation of the Washing Software
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;

    public CottonMachine(Machine machine, Button button, Valve valve, Motor motor,
                         Heater heater, Sensor sensor, SoilRemoval
                         soilRemoval) {
        this.machine = machine;
        this.button = button;
        this.valve = valve;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;

        System.out.println("Set up of Cotton Program!");
    }

    /*
    * Starts up the machine on button press.
    *
    * Delegates to the machine when it's called from Button
    *
    * */
    @Override
    public void start() {
        this.machine.start();

    }

    /*
    * Starts the wash cycle.
    *
    * Delegates to motor and soilRemover when called from the machine
    *
    * */
    @Override
    public void wash() {
        this.motor.startMotor();
        this.motor.rotateDrum();

        System.out.println("Adding detergent from Soil Remover!");
        this.soilRemoval.low();
        System.out.println("Adding softener");

    }

    /*
    * Opens up the valve, this is called from the Machine and asks the valve but instead of working directly with
    * the valve the Machine delegates to us and we delegate it to the valve!
    *
    * */
    @Override
    public void open() {
        this.valve.open();

    }

    /**
     * Also called from our Machine which is delegated to us and then we appropriately send it to the valve
     *
     * */
    @Override
    public void closed() {
        this.valve.close();

    }

    /**
     * Once valve is open and closed and water is filled in, the valve will then ask the Heater
     * to turn on to start the wash
     *
     *
     * */
    @Override
    public void on() {
        this.heater.on(40);

    }

    /*
    * Once the wash cycle is finished it'll appropriately turn off
    *
    * */
    @Override
    public void off() {
        this.heater.off();

    }

    @Override
    public boolean checkTemperature(int temp) {
        return this.sensor.checkTemperature(temp);
    }
}
