package design.chain_responsibility_pattern;

/**
 * Description File日志记录器
 * Date 2022/5/11 14:38
 * Version 1.0.1
 *
 * @author Wen
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
