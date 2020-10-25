package item;

import player.AbstractPlayer;

public class Coins extends BossItem implements item{

    public Coins(String name, int quantity) {
        super.setName(name);
        super.setAll(quantity);
        super.setLabel("деньги");
    }
    public Coins(){}


    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }


}
