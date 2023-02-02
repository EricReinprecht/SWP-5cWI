package Dogs;
public abstract class AbstractDog implements Dog {
    String name;
    BarkStrategy barkStrategy;
    public AbstractDog(BarkStrategy barkStrategy, String name) {
        this.name = name;
        this.barkStrategy = barkStrategy;
    }
}
