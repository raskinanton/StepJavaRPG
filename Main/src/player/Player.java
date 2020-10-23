package player;

public class Player extends AbstractPlayer {
    private Specification spec;

    public Player(String name, int hp, int hpMax, int coins, int armor, int attack){
        this.spec = new Specification(name, hp, hpMax,coins,armor, attack);
    }

    public Specification getSpec() {
        return spec;
    }
}
