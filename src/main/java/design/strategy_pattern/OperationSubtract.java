package design.strategy_pattern;

/**
 * Description 减法策略类
 * Date 2022/5/20 10:35
 * Version 1.0.1
 *
 * @author Wen
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
