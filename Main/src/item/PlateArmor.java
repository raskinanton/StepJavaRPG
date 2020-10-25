package item;

import player.AbstractPlayer;

public class PlateArmor extends BossItem implements item{


    public PlateArmor(String name, int protection) {
        super.setName(name);
        super.setAll(protection);
        super.setLabel("латы");
    }

    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }


}
