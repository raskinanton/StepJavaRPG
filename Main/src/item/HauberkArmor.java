package item;

import player.AbstractPlayer;

public class HauberkArmor extends BossItem implements item {

    public HauberkArmor(String name, int protection) {

        super.setName(name);
        super.setAll(protection);
        super.setLabel("броня");
    }



    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }
}
