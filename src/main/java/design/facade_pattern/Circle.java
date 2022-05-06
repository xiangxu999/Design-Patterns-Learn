package design.facade_pattern;

/**
 * Description 圆形
 * Date 2022/5/5 19:47
 * Version 1.0.1
 *
 * @author Wen
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
