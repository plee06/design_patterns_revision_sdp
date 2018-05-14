package flyweight;

public class CPPPlatform implements Platform {
    @Override
    public void execute(Code code) {
        System.out.println("Executing C++ Code");
    }
}
