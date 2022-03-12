package design.abstract_factory_pattern;

/**
 * Description 跑步鞋
 * Date 2022/3/12 10:49
 * Version 1.0.1
 *
 * @author Wen
 */
public class RunningShoe implements Shoe{
    @Override
    public void walk() {
        System.out.println("跑步鞋走路");
    }
}
