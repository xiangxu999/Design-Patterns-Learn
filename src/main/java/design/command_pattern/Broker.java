package design.command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 命令调用类
 * Date 2022/5/12 17:10
 * Version 1.0.1
 *
 * @author Wen
 */
public class Broker {
    private final List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
