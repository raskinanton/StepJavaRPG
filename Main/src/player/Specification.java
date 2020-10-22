package player;

public class Specification {
    private String name;
    private int hp;
    private int hpMax;
    private int coins;
    private int armor;

    public Specification(String name, int hp, int hpMax, int coins, int armor) {
        this.name = name;
        this.hp = hp;
        this.hpMax = hpMax;
        this.coins = coins;
        this.armor = armor;
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
}

