package design.prototype_pattern;

/**
 * Description 通用克隆演示
 * Date 2022/3/15 14:22
 * Version 1.0.1
 *
 * @author Wen
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setStr("Sunny");
        ConcretePrototype clone = (ConcretePrototype) concretePrototype.clone();
    }
}
