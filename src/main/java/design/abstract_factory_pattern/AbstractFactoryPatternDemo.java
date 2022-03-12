package design.abstract_factory_pattern;

/**
 * Description 抽象工厂模式案例
 * Date 2022/3/12 11:05
 * Version 1.0.1
 *
 * @author Wen
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 创建衣服工厂
        AbstractFactory clotheFactory = FactoryProducer.getFactory("Clothe");
        // 衣服工厂创建衣服
        Clothe hat = clotheFactory.getWear("Hat");
        Clothe sleeve = clotheFactory.getWear("Sleeve");
        Clothe skirt = clotheFactory.getWear("Skirt");

        hat.wear();
        sleeve.wear();
        skirt.wear();


        // 创建鞋子工厂
        AbstractFactory shoeFactory = FactoryProducer.getFactory("Shoe");
        // 鞋子工厂创建鞋子
        Shoe basketBall = shoeFactory.getWalk("BasketballShoe");
        Shoe running = shoeFactory.getWalk("RunningShoe");
        Shoe football = shoeFactory.getWalk("FootballShoe");

        basketBall.walk();
        running.walk();
        football.walk();


    }
}
