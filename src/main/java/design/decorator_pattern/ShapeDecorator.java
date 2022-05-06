package design.decorator_pattern;

/**
 * Description Shape接口的抽象装饰类
 * Date 2022/5/5 19:48
 * Version 1.0.1
 *
 * @author Wen
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
