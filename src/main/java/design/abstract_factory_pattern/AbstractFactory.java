package design.abstract_factory_pattern;

/**
 * Description 抽象工厂
 * Date 2022/3/12 10:55
 * Version 1.0.1
 *
 * @author Wen
 */
public abstract class AbstractFactory {

    /**
     * 获取走路方法
     * @param shoeType 鞋子种类
     * @return
     */
    abstract Shoe getWalk(String shoeType);

    /**
     * 获取穿戴方法
     * @param clotheType 衣服种类
     * @return
     */
    abstract Clothe getWear(String clotheType);
}
