package head_first.strategy_pattern;

public class Quack implements QuackInterface {

    @Override
    public void quack()
    {
        System.out.println("Quack!");
    }
}
