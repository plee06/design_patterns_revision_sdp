package head_first.strategy_pattern;

public class MuteQuack implements QuackInterface {

    @Override
    public void quack()
    {
        System.out.println("Muted quack. I can't quack!");
    }
}
