package design.builder_pattern;

/**
 * Description 纸包装
 * Date 2022/3/14 9:06
 * Version 1.0.1
 *
 * @author Wen
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "纸包装";
    }
}
