package item;

import player.AbstractPlayer;

public class HealthBarrel extends BossItem implements item{

    public HealthBarrel(String name, int volume) {
        super.setName(name);
        super.setAll(volume);
        super.setLabel("здоровье");
    }
    public HealthBarrel(){}



    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }
}
