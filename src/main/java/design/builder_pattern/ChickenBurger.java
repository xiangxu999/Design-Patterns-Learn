package design.builder_pattern;

/**
 * Description 鸡肉堡
 * Date 2022/3/14 9:15
 * Version 1.0.1
 *
 * @author Wen
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "鸡肉堡";
    }
}
