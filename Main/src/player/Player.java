package player;

public class Player extends AbstractPlayer {
    private Specification spec;

    public Player(String name, int hp, int hpMax, int coins, int armor){
        this.spec = new Specification(name, hp, hpMax,coins,armor);
    }

    public Specification getSpec() {
        return spec;
    }
}
