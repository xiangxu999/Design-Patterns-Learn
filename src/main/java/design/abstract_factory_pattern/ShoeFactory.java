package design.abstract_factory_pattern;

/**
 * Description 鞋子工厂
 * Date 2022/3/12 11:00
 * Version 1.0.1
 *
 * @author Wen
 */
public class ShoeFactory extends AbstractFactory{

    @Override
    Shoe getWalk(String shoeType) {
        if (shoeType == null) {
            return null;
        }
        if ("BasketballShoe".equalsIgnoreCase(shoeType)) {
            return new BasketballShoe();
        } else if ("FootballShoe".equalsIgnoreCase(shoeType)) {
            return new FootballShoe();
        } else if ("RunningShoe".equalsIgnoreCase(shoeType)) {
            return new RunningShoe();
        }
        return null;
    }

    @Override
    Clothe getWear(String clotheType) {
        return null;
    }
}
