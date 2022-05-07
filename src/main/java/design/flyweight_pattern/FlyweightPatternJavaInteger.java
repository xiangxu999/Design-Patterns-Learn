package design.flyweight_pattern;

/**
 * Description 享元模式在java的Integer的使用
 * Date 2022/5/7 20:28
 * Version 1.0.1
 *
 * @author Wen
 */
public class FlyweightPatternJavaInteger {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = Integer.valueOf(127);
        Integer z = new Integer(127);
        System.out.println(x == y);
        System.out.println(x == z);

        Integer m = Integer.valueOf(200);
        Integer n = Integer.valueOf(200);
        System.out.println(m == n);
    }
}
