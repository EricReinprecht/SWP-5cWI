package ObserverPattern;
public class Main {
    public static void main(String[] args) {
        SunCollector s1 = new SunCollector();
        Heater h1 = new Heater();
        Heater h2 = new Heater();
        s1.addToSunCollector(h1);
        s1.addToSunCollector(h2);
        if(s1.getVolt() >= 18){
            for (Observer observers: s1.getObservers()){
                observers.inform();
            }
        }
    }
}
