package design.command_pattern;

/**
 * Description 请求类
 * Date 2022/5/12 17:06
 * Version 1.0.1
 *
 * @author Wen
 */
public class Stock {
    private final String name = "ABC";
    private final int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity +" ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity +" ]sold ");
    }
}
