package design.bridge_pattern;

/**
 * Description 抽象类Shape
 * Date 2022/4/27 9:49
 * Version 1.0.1
 *
 * @author Wen
 */
public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 抽象方法
     */
    public abstract void draw();
}
