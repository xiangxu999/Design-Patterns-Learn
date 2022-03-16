package design.prototype_pattern;

/**
 * Description 长方形
 * Date 2022/3/16 20:02
 * Version 1.0.1
 *
 * @author Wen
 */
public class Rectangle extends Shape {

    Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("长方形的draw()方法");
    }
}
