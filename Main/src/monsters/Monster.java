package monsters;

import player.Player;
import player.Specification;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IntMonster {

    private String monsterName;
    private int damage;
    private int heals;
    private int payCoins;

    public Monster(String monsterName, int damage, int heals, int payCoins) {
        this.monsterName = monsterName;
        this.damage = damage;
        this.heals = heals;
        this.payCoins = payCoins;
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
        Specification specPlayer = player.getSpec();
        return specPlayer.getCoins() > payCoins;

    }
}
