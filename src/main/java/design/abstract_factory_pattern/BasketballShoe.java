package design.abstract_factory_pattern;


/**
 * Description 篮球鞋
 * Date 2022/3/12 10:48
 * Version 1.0.1
 *
 * @author Wen
 */
public class BasketballShoe implements Shoe{
    @Override
    public void walk() {
        System.out.println("篮球鞋走路");
    }
}
