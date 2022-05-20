package design.strategy_pattern;

/**
 * Description 加法策略类
 * Date 2022/5/20 10:37
 * Version 1.0.1
 *
 * @author Wen
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
