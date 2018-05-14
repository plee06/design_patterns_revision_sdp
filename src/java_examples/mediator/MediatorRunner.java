package mediator;

import javax.crypto.Mac;

/**
 * Our Example Mediator Runner for the Mediator Design Pattern
 *
 * The whole point of the Mediator is to "mediate" the behaviours that related objects may need in an overarching
 * scheme.
 *
 * Consider creating a specific Machine for all the different Machines and then those machines working
 * Directly with Button, Heater, SoilRemoval etc.
 *
 * But will every Machine need all of those? Some won't. That means for every Machine that's different
 * you'd have to implement it differently within those classes but that'd be difficult to do because then
 * you'd need a bunch of if/else conditionals in Heater or Sensor or anything ...
 *
 * if (CottonMachine) then do light soil removal .... and set heat high
 * if (JeansMachine) then do heavy soil removal and set heat low ...
 *
 * */
public class MediatorRunner {

    public static void main(String[] args) {
        // Instantiate all our Components, i.e. Colleagues
        Machine machine = new Machine();
        Sensor sensor = new Sensor();
        Heater heater = new Heater();
        Motor motor = new Motor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Valve valve = new Valve();
        Button button = new Button();

        // Now set our mediator and pass in all objects that need mediation
        MachineMediator cottonMachine = new CottonMachine(machine, button, valve, motor, heater, sensor, soilRemoval);

        // Now we can do everything accordingly by setting the needed mediator for all components
        machine.setMediator(cottonMachine);
        heater.setMediator(cottonMachine);
        motor.setMediator(cottonMachine);
        valve.setMediator(cottonMachine);
        button.setMediator(cottonMachine);

        // Done! Now we run it by simply pushing the button and delegating everything through the mediator
        button.press();

        /**
         * Now consider if we didn't have a mediator. That means we'd have to go through and have a bunch if/else
         * conditionals set up for each Colleague to check what kind of machine it was and then run the method
         * appropriately.
         *
         * By having a specific delegator (Mediator) like CottonMachine we can do all the behavioural differences
         * in each one of these Mediator classes instead of a bunch of conditionals within each of our
         * Colleagues!
         *
         * The problem here isn't the specific Machine implementations (the code more or less will stay the same)
         * as we just call the different components but by having a mediator we can write LESS code in the Colleagues
         * and not have all those conditionals!
         *
         *
         * */

    }
}
