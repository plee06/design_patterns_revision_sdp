package flyweight;

/**
 * Revealing the problem.
 *
 * This interface is implemented by the specific language platform the programmer gives the code to
 * execute and we use this interface to implement a specific platform in order
 * to execute the code
 *
 *
 * */
public interface Platform {

    void execute(Code code);
}
