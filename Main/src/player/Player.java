package player;

import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractPlayer {
    private Specification spec;
    private List itemsList = new ArrayList();

    public Player(String name, int hp, int hpMax, int coins, int armor, int attack){
        this.spec = new Specification(name, hp, hpMax,coins,armor, attack);
    }

    public List getItemsList() {
        return itemsList;
    }

    public Specification getSpec() {
        return spec;
    }

    public void toUseItem(int i){

    }
}
