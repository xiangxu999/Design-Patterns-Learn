package design.factory_pattern;

/**
 * Description 长方形
 * Date 2022/3/11 22:05
 * Version 1.0.1
 *
 * @author Wen
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle的draw方法");
    }
}
