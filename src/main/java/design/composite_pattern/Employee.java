package design.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 员工类
 * Date 2022/4/29 9:22
 * Version 1.0.1
 *
 * @author Wen
 */
public class Employee {

    private final String name;
    private final String dept;
    private final int salary;
    private final List<Employee> subordinates;

    //构造函数
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
