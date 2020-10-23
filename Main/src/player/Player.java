package player;

public class Player extends AbstractPlayer {
    private Specification spec;

    public Player(String name, int a, int b, int c, int d){
        this.spec = new Specification(name, a, b,c,d);
    }

    public Specification getSpec() {
        return spec;
    }
}
