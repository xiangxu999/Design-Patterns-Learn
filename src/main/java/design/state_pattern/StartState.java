package design.state_pattern;

/**
 * Description 具体状态类
 * Date 2022/5/19 10:41
 * Version 1.0.1
 *
 * @author Wen
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
