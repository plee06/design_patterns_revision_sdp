package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;

import head_first.strategy_pattern.factory_pattern.simple.Pizza;

/*
* Concrete Product Implementations, represents Clam Pizza!
*
* */
public class ClamPizza extends Pizza {


    public ClamPizza()
    {
        System.out.println("I'm a Clam Pizza. And I just got instantiated.");
    }
}
