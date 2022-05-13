package design.iterator_pattern;

/**
 * Description 迭代器案例
 * Date 2022/5/13 16:02
 * Version 1.0.1
 *
 * @author Wen
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
