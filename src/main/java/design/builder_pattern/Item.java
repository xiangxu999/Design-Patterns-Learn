package design.builder_pattern;

/**
 * Description 食物条目和食物包装的接口
 * Date 2022/3/14 9:02
 * Version 1.0.1
 *
 * @author Wen
 */
public interface Item {

    /**
     * 名称
     * @return String
     */
    public String name();

    /**
     * 打包方式
     * @return String
     */
    public Packing packing();


    /**
     * 单价
     * @return String
     */
    public float price();
}
