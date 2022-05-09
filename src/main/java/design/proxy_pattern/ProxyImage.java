package design.proxy_pattern;

/**
 * Description 代理
 * Date 2022/5/9 9:49
 * Version 1.0.1
 *
 * @author Wen
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
