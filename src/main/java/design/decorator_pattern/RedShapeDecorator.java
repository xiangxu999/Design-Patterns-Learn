package design.decorator_pattern;

/**
 * Description ShapeDecorator 类的实体装饰类。
 * Date 2022/5/5 19:49
 * Version 1.0.1
 *
 * @author Wen
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
