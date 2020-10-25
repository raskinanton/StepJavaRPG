package item;

import player.AbstractPlayer;

public class Crossbow extends BossItem implements item {
    private String name;
    private int damage;

    public Crossbow(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }


    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
