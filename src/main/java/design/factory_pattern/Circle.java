package design.factory_pattern;

/**
 * Description 圆形
 * Date 2022/3/11 22:07
 * Version 1.0.1
 *
 * @author Wen
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle的draw方法");
    }
}
