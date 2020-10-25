package item;

import player.AbstractPlayer;

public class Crossbow extends BossItem implements item {

    public Crossbow(String name, int damage) {
        super.setName(name);
        super.setAll(damage);
        super.setLabel("арбалет");
    }


    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }


}
