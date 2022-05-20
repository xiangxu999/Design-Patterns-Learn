package design.strategy_pattern;

/**
 * Description 环境类
 * Date 2022/5/20 10:38
 * Version 1.0.1
 *
 * @author Wen
 */
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
