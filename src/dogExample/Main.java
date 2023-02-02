package dogExample;
public class Main {
    public static void main(String[] args) {
        WuffWuff w1 = new WuffWuff();
        Poodle p1 = new Poodle(w1, "LÖWE");
        p1.run();
    }
}
