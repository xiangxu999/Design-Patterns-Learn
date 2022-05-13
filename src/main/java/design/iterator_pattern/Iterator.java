package design.iterator_pattern;

/**
 * Description 迭代器接口
 * Date 2022/5/13 15:55
 * Version 1.0.1
 *
 * @author Wen
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}
