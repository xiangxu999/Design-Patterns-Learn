package design.abstract_factory_pattern;


/**
 * Description 帽子
 * Date 2022/3/12 10:46
 * Version 1.0.1
 *
 * @author Wen
 */
public class Hat implements Clothe{

    @Override
    public void wear() {
        System.out.println("穿帽子");
    }
}
