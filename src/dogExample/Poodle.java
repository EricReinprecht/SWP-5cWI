package dogExample;
public class Poodle extends AbstractDog{
    public Poodle(BarkStrategy barkStrategy, String name) {
        super(barkStrategy, name);
    }
    @Override
    public void run() {
        this.barkStrategy.Bark(this.name);
    }
}
