package design.builder_pattern;

/**
 * Description 抽象汉堡
 * Date 2022/3/14 9:12
 * Version 1.0.1
 *
 * @author Wen
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }


    /**
     * 汉堡的价格
     * @return
     */
    @Override
    public abstract float price();
}
