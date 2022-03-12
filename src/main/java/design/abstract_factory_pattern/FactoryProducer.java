package design.abstract_factory_pattern;


/**
 * Description 工厂生产者
 * Date 2022/3/12 11:03
 * Version 1.0.1
 *
 * @author Wen
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("Shoe".equalsIgnoreCase(choice)){
            return new ShoeFactory();
        } else if("Clothe".equalsIgnoreCase(choice)){
            return new ClotheFactory();
        }
        return null;
    }
}
