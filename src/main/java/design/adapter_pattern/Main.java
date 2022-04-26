package design.adapter_pattern;

/**
 * Description 实现类
 * Date 2022/4/26 16:32
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {
    public static void main(String[] args) {
        CarController car = new PoliceCarAdapter();
        car.move();
        car.phonate();
        car.twinkle();
    }
}
