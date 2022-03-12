package design.abstract_factory_pattern;

/**
 * Description 袖子
 * Date 2022/3/12 10:44
 * Version 1.0.1
 *
 * @author Wen
 */
public class Sleeve implements Clothe{
    @Override
    public void wear() {
        System.out.println("穿长袖");
    }
}
