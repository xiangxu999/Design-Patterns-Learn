package design.facade_pattern;

/**
 * Description 案例实现
 * Date 2022/5/6 12:43
 * Version 1.0.1
 *
 * @author Wen
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
