package model;

//Subject (Publisher)
import java.util.ArrayList;
import java.util.List;

public class X implements Subject{

    private final List<Observer> observers;
    private int i = 10;

    public X() {
        this.observers = new ArrayList<>();
    }

    public void setI(int i) {
        this.i = i;
        notifyObserver();
    }

    public int getI() {
        return i;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.display(i);
        }
    }
}
