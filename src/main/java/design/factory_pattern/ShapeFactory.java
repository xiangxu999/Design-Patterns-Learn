package design.factory_pattern;

/**
 * Description 图形工厂
 * Date 2022/3/11 22:23
 * Version 1.0.1
 *
 * @author Wen
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
