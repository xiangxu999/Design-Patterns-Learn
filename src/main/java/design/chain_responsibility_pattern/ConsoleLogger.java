package design.chain_responsibility_pattern;

/**
 * Description console日志记录器
 * Date 2022/5/11 14:35
 * Version 1.0.1
 *
 * @author Wen
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
