package monsters;

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
    public int attack() {
        return 0;
    }

    @Override
    public int pass() {
        return 0;
    }
}
