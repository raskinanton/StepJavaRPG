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
    public boolean attack(Player player, Monster monster) {

//        Specification specPlayer = player.getSpec();
//
//        if (specPlayer.getCoins())

        return true;
    }

    @Override
    public boolean pass(Player player, Monster monster) {
        Specification specPlayer = player.getSpec();
        Specification specMonster = monster.getSpec();
        return specPlayer.getCoins() < specMonster.getCoins();

    }
}
