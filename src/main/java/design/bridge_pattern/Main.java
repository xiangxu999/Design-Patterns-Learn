package design.bridge_pattern;

/**
 * Description 案例实现
 * Date 2022/4/27 9:53
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
