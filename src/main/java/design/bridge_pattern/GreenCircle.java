package design.bridge_pattern;

/**
 * Description 绿色的圆
 * Date 2022/4/27 9:49
 * Version 1.0.1
 *
 * @author Wen
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
