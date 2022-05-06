package design.facade_pattern;

/**
 * Description 正方形
 * Date 2022/5/6 12:40
 * Version 1.0.1
 *
 * @author Wen
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
