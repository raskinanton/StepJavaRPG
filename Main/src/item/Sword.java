package item;
import player.AbstractPlayer;

public class Sword extends BossItem implements item {

    public Sword(String name, int damage) {
        super.setName(name);
        super.setAll(damage);
        super.setLabel("мечь");
    }
    public Sword(){}

    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }

    }
