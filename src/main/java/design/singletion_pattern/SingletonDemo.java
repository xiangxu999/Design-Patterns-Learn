package design.singletion_pattern;

/**
 * Description 单例模式案例
 * Date 2022/3/13 9:22
 * Version 1.0.1
 *
 * @author Wen
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance01 = Singleton.getInstance();
        Singleton instance02 = Singleton.getInstance();

        // 判断两个对象是否相同
        if(instance01 == instance02) {
            System.out.println("两个对象是相同实例");
        } else {
            System.out.println("两个对象是不同实例");
        }
    }
}
