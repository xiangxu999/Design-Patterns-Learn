package design.prototype_pattern;

/**
 * Description 正方形
 * Date 2022/3/16 20:03
 * Version 1.0.1
 *
 * @author Wen
 */
public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("正方形的draw()方法");
    }

}
