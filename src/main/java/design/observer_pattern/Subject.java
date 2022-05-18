package design.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 目标
 * Date 2022/5/18 9:21
 * Version 1.0.1
 *
 * @author Wen
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
