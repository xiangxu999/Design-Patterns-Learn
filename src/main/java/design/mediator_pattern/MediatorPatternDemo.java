package design.mediator_pattern;

/**
 * Description 中介模式
 * Date 2022/5/14 15:14
 * Version 1.0.1
 *
 * @author Wen
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
