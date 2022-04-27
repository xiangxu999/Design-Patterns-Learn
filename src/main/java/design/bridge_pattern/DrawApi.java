package design.bridge_pattern;

/**
 * Description 画圆的接口
 * Date 2022/4/27 9:45
 * Version 1.0.1
 *
 * @author Wen
 */
public interface DrawApi {

    /**
     * 画图
     * @param radius 半径
     * @param x x坐标
     * @param y y坐标
     */
    void drawCircle(int radius, int x, int y);
}
