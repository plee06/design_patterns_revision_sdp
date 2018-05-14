package head_first.strategy_pattern.factory_pattern.simple.factory_method_pattern;


// Our ChicagoStylePizzaStore, implementing createPizza to return specific Chicago style pizza's
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String typeOfPizza) {
        Pizza pizza = null;

        if (typeOfPizza.equals("cheese"))
        {
            pizza = new ChicagoStyleCheese();
        } else if (typeOfPizza.equals("marinara"))
        {
            pizza = new ChicagoStyleMarinara();
        }

        return pizza;
    }
}
