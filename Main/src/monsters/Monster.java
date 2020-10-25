package monsters;

import player.Player;
import player.Specification;

public class Monster implements IntMonster {
    private Specification spec;

    public Monster(String name, int hp, int hpMax, int coins, int armor, int attack){
        this.spec = new Specification(name, hp, hpMax,coins,armor, attack);
    }

    public Specification getSpec() {
        return spec;
    }


    @Override
    public boolean attack(Player player) {

//        Specification specPlayer = player.getSpec();
//
//        if (specPlayer.getCoins())

        return true;
    }

    @Override
    public boolean pass(Player player) {
        return player.getSpec().getCoins() < spec.getCoins();
    }
}
