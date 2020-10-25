package player;

import java.util.ArrayList;
import java.util.List;

public class Specification {
    private String name;
    private int hp;
    private int hpMax;
    private int coins;
    private int armor;
    private int attack;

    public Specification(String name, int hp, int hpMax, int coins, int armor, int attack, List list) {
        this.name = name;
        this.hp = hp;
        this.hpMax = hpMax;
        this.coins = coins;
        this.armor = armor;
        this.attack = attack;

    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getHpMax() {
        return hpMax;
    }

    public int getCoins() {
        return coins;
    }

    public int getArmor() {
        return armor;
    }

    public int getAttack() {return  attack;}


    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

