package design.bridge_pattern;

/**
 * Description 圆
 * Date 2022/4/27 9:51
 * Version 1.0.1
 *
 * @author Wen
 */
public class Circle extends Shape {

    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
