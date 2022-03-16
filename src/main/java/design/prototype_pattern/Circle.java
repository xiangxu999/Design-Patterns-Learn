package design.prototype_pattern;

/**
 * Description 圈
 * Date 2022/3/16 20:06
 * Version 1.0.1
 *
 * @author Wen
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("圈的draw()方法");
    }

}
