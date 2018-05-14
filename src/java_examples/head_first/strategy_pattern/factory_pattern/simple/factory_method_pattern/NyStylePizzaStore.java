package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;

// Our NyStylePizzaStore which extends PizzaStore! The only method it has to implement is createPizza
public class NyStylePizzaStore extends PizzaStore {



    @Override
    Pizza createPizza(String typeOfPizza) {
        Pizza pizza = null;

        if (typeOfPizza.equals("cheese"))
        {
            pizza = new NyStyleCheese();
        } else if (typeOfPizza.equals("marinara"))
        {
            pizza = new NyStyleMarinara();
        }

        return pizza;
    }

}
