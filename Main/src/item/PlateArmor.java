package item;

import player.AbstractPlayer;

public class PlateArmor extends BossItem implements item{
    private String name;
    private int protection;

    public PlateArmor(String name, int protection) {
        this.name = name;
        this.protection = protection;
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

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}
