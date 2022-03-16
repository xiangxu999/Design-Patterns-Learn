package design.prototype_pattern;

/**
 * Description 普通类
 * Date 2022/3/15 14:19
 * Version 1.0.1
 *
 * @author Wen
 */
public class ConcretePrototype extends Prototype{

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }


    @Override
    public Prototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setStr(this.str);
        return concretePrototype;
    }
}
