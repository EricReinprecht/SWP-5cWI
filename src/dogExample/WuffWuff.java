package dogExample;
public class WuffWuff implements BarkStrategy {

    @Override
    public void Bark(String name) {
        System.out.println("WuffWuff WuffWuff I am " + name);
    }
}
