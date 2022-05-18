package design.observer_pattern;

/**
 * Description 具体观察者
 * Date 2022/5/18 9:24
 * Version 1.0.1
 *
 * @author Wen
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
