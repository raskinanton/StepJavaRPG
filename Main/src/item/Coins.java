package item;

import player.AbstractPlayer;

public class Coins implements Item {
    private String name;
    private int quantity;

    public Coins(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public boolean apply(AbstractPlayer abstractPlayer) {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
