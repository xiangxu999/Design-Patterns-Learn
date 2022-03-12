package design.abstract_factory_pattern;

/**
 * Description 足球鞋
 * Date 2022/3/12 10:53
 * Version 1.0.1
 *
 * @author Wen
 */
public class FootballShoe implements Shoe{
    @Override
    public void walk() {
        System.out.println("足球鞋走路");
    }
}
