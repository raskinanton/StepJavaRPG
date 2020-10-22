package player.item;

import player.AbstractPlayer;

public class HealthBarrel implements item{
    private int volume;

    public HealthBarrel(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
