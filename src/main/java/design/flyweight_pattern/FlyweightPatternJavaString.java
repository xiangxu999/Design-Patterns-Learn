package design.flyweight_pattern;

/**
 * Description 享元模式在java的String的使用
 * Date 2022/5/7 20:40
 * Version 1.0.1
 *
 * @author Wen
 */
public class FlyweightPatternJavaString {
    public static void main(String[] args) {
        String s1 = "wxx";
        String s2 = "wxx";
        String s3 = new String("wxx");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
