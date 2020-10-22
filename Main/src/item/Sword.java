package item;

import player.AbstractPlayer;

public class Sword implements item {
    private String name;
    private int damage;

    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }
}
