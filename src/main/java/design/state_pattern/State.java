package design.state_pattern;

/**
 * Description 抽象状态类
 * Date 2022/5/19 10:39
 * Version 1.0.1
 *
 * @author Wen
 */
public interface State {
    public void doAction(Context context);
}
