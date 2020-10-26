package item;

import player.AbstractPlayer;

public class LeatherArmor extends BossItem implements item {

    public LeatherArmor(String name, int protection) {
        super.setName(name);
        super.setAll(protection);
        super.setLabel("кожа");
    }
    public LeatherArmor(){}



    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }
}
