package design.proxy_pattern;

/**
 * Description 接口实体类
 * Date 2022/5/9 9:47
 * Version 1.0.1
 *
 * @author Wen
 */
public class RealImage implements Image{

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
