package design.factory_pattern;

/**
 * Description 正方形
 * Date 2022/3/11 22:06
 * Version 1.0.1
 *
 * @author Wen
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square的draw方法");
    }
}
