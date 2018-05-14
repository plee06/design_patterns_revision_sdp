package command;

/**
 * RUnner for our Command design pattern
 *
 *
 * */

/**
 * What's happening?
 *
 * We have a Set of Command objects which all implement a specific Job interface.
 *
 * Each one of these Command objects are responsible for running a specific "Job" (which here are Receiver objects).
 *
 * Each Command object is composed of a specific Receiver object which is run based on the client call to the Command
 * object. We can look at this as a delegation of responsibilities, Client -> COmmand Objects -> Receiver
 * and the Command object gets the functionality and runs it.
 *
 * The Command objects can be replaced on the same variable because they all implement the same Job interface.
 *
 * Easy changing!
 *
 * all we do is create one Commad object and then create the actual Receiver object and we pass
 * that Receiver object into the Command object ...
 *
 *
 *
 * */
public class CommandRunner {


}
