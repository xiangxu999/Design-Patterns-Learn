package design.adapter_pattern;

/**
 * Description 汽车控制类
 * Date 2022/4/26 16:22
 * Version 1.0.1
 *
 * @author Wen
 */
public abstract class CarController {

    public void move() {
        System.out.println("玩具汽车移动");
    }

    /**
     * 发出声音
     */
    public abstract void phonate();


    /**
     * 灯光闪烁
     */
    public abstract void twinkle();
}
