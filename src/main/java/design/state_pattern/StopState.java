package design.state_pattern;

/**
 * Description 具体状态类
 * Date 2022/5/19 10:50
 * Version 1.0.1
 *
 * @author Wen
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
