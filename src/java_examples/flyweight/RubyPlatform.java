package flyweight;

public class RubyPlatform implements Platform {
    @Override
    public void execute(Code code) {
        System.out.println("Executing Ruby Code");
    }
}
