package design.state_pattern;

/**
 * Description 环境类
 * Date 2022/5/19 10:40
 * Version 1.0.1
 *
 * @author Wen
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
