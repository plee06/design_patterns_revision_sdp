package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;

import head_first.strategy_pattern.factory_pattern.simple.Pizza;

public class VeggiePizza extends Pizza {

    public VeggiePizza()
    {
        System.out.println("I'm a Veggie Pizza. And I just got instantiated.");
    }
}
