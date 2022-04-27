package design.bridge_pattern;

/**
 * Description 红色的圆
 * Date 2022/4/27 9:47
 * Version 1.0.1
 *
 * @author Wen
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
