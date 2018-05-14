package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;

public abstract class Pizza {



    void prepare()
    {
        System.out.println("Preparing the Pizza");
    }
    void bake()
    {
        System.out.println("Baking the Pizza");
    }
    void cut()
    {
        System.out.println("Cutting up the Pizza");
    }
    void box()
    {
        System.out.println("Boxing up the Pizza");
    }


}
