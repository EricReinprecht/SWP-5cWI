package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SunCollector {
    private int Volt = 18;
    List <Observer> observers;

    public SunCollector() {
        this.observers = new ArrayList();
    }
    public void addToSunCollector(Observer observer){
            observers.add(observer);
    };

    public int getVolt() {
        return Volt;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
