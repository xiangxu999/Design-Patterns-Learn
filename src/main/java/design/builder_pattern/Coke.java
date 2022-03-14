package design.builder_pattern;

/**
 * Description 可乐
 * Date 2022/3/14 9:16
 * Version 1.0.1
 *
 * @author Wen
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可乐";
    }
}
