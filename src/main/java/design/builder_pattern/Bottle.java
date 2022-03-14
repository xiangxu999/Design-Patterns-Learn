package design.builder_pattern;

/**
 * Description 瓶装
 * Date 2022/3/14 9:07
 * Version 1.0.1
 *
 * @author Wen
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "瓶装";
    }
}
