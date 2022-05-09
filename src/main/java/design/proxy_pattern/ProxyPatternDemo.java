package design.proxy_pattern;

/**
 * Description 代理模式案例
 * Date 2022/5/9 9:50
 * Version 1.0.1
 *
 * @author Wen
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将不从磁盘加载
        image.display();
    }
}
