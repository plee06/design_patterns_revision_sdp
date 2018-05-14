package flyweight;

public class CPlatform implements Platform {



    public CPlatform() {
        System.out.println("C Platform Has been Created");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Executing C Code");
    }
}
