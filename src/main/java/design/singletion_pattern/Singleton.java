package design.singletion_pattern;

/**
 * Description 单例
 * Date 2022/3/13 9:17
 * Version 1.0.1
 *
 * @author Wen
 */
public class Singleton {
    /**
     * 静态私有成员变量
     */
    private static Singleton instance = null;

    /**
     * 私有构造方法
     */
    private Singleton() {}


    /**
     * 静态公有工厂方法，返回唯一的实例
     */
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
