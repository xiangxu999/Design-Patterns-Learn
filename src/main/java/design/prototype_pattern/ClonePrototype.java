package design.prototype_pattern;

/**
 * Description 实现Clone()方法
 * Date 2022/3/15 14:31
 * Version 1.0.1
 *
 * @author Wen
 */
public class ClonePrototype implements Cloneable{

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
