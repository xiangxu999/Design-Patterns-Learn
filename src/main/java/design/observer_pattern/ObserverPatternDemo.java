package design.observer_pattern;

/**
 * Description 案例实现
 * Date 2022/5/18 9:28
 * Version 1.0.1
 *
 * @author Wen
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
