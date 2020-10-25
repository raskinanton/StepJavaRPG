package player;

import java.util.List;

public class Player extends AbstractPlayer {
    private Specification spec;

    public Player(String name, int hp, int hpMax, int coins, int armor, int attack, List list){
        this.spec = new Specification(name, hp, hpMax,coins,armor, attack, list);
    }

    public Specification getSpec() {
        return spec;
    }

    public void toUseItem(int i){

    }
}
