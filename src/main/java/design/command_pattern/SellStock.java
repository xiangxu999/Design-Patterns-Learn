package design.command_pattern;

/**
 * Description Order实体类
 * Date 2022/5/12 17:09
 * Version 1.0.1
 *
 * @author Wen
 */
public class SellStock implements Order {
    private final Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
