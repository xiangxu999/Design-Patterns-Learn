package design.abstract_factory_pattern;


/**
 * Description 衣服工厂
 * Date 2022/3/12 10:57
 * Version 1.0.1
 *
 * @author Wen
 */
public class ClotheFactory extends AbstractFactory {
    @Override
    Shoe getWalk(String shoeType) {
        return null;
    }

    @Override
    Clothe getWear(String clotheType) {
        if (clotheType == null) {
            return null;
        }
        if ("Sleeve".equalsIgnoreCase(clotheType)) {
            return new Sleeve();
        } else if ("Hat".equalsIgnoreCase(clotheType)) {
            return new Hat();
        } else if ("Skirt".equalsIgnoreCase(clotheType)) {
            return new Skirt();
        }
        return null;
    }
}
