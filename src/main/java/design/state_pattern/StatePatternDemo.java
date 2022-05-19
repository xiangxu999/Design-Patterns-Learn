package design.state_pattern;

/**
 * Description 状态模式案例
 * Date 2022/5/19 10:52
 * Version 1.0.1
 *
 * @author Wen
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
