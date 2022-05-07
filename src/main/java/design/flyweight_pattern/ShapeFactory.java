package design.flyweight_pattern;

import java.util.HashMap;

/**
 * Description 图形工厂
 * Date 2022/5/7 20:20
 * Version 1.0.1
 *
 * @author Wen
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
