package design.chain_responsibility_pattern;

/**
 * Description error日志记录器
 * Date 2022/5/11 14:37
 * Version 1.0.1
 *
 * @author Wen
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
