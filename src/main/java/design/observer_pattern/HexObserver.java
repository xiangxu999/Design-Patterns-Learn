package design.observer_pattern;

/**
 * Description 具体观察者
 * Date 2022/5/18 9:25
 * Version 1.0.1
 *
 * @author Wen
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
