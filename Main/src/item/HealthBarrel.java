package item;

import player.AbstractPlayer;

public class HealthBarrel implements item{
    private String name;
    private int volume;

    public HealthBarrel(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }
}
