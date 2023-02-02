package ObserverPattern;
public class Heater implements Observer {
    @Override
    public void inform() {
        System.out.println("start heating");
    }
}
