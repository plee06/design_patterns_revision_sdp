package flyweight;

/**
 * Revealing of problem with X-Programming Website Slowing down.
 *
 *
 * This class is used to set the code done by the programmer in order to get it executed on our website.
 *
 * It's a lightweight simple object having a simple property of code along with getters and setters.
 *
 * */
public class Code {

    private String code;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
