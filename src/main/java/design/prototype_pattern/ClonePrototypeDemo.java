package design.prototype_pattern;

/**
 * Description Clone（）案例
 * Date 2022/3/16 17:05
 * Version 1.0.1
 *
 * @author Wen
 */
public class ClonePrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonePrototype clonePrototype = new ClonePrototype();
        Object clone = clonePrototype.clone();
    }
}
