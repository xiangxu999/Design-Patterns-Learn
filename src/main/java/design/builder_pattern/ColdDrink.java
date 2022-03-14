package design.builder_pattern;

/**
 * Description 抽象冰镇水
 * Date 2022/3/14 9:14
 * Version 1.0.1
 *
 * @author Wen
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 冰镇水价格
     * @return
     */
    @Override
    public abstract float price();
}
