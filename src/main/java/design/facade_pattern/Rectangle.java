package design.facade_pattern;


/**
 * Description 长方形
 * Date 2022/5/5 19:46
 * Version 1.0.1
 *
 * @author Wen
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
