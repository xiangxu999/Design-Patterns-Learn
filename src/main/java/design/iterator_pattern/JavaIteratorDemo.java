package design.iterator_pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Description Java迭代器
 * Date 2022/5/13 15:09
 * Version 1.0.1
 *
 * @author Wen
 */
public class JavaIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();  // 删除小于 10 的元素
            }
        }
        System.out.println(list);
    }
}
