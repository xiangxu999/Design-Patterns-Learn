package design.observer_pattern;

/**
 * Description 抽象观察者
 * Date 2022/5/18 9:21
 * Version 1.0.1
 *
 * @author Wen
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
