package player;

import item.Coins;

import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractPlayer {
    private Specification spec;
    private List itemsList = new ArrayList();

    public Player(String name, int hp, int hpMax, int coins, int armor, int attack){
        this.spec = new Specification(name, hp, hpMax,coins,armor, attack);
    }

    public List getItemsList() {
        return itemsList;
    }

    public Specification getSpec() {
        return spec;
    }
    public void printPlayer(Specification spec){
        System.out.println("Имя игрока - "+spec.getName());
        System.out.println("Количество hp - "+spec.getHp());
        System.out.println("Количество монет - "+spec.getCoins());
        System.out.println("Защита - "+spec.getArmor());
        System.out.println("Атака - "+spec.getAttack());
    }

    public void toUseItem(int i){
        System.out.println("1 - Монеты");
        System.out.println("2 - Здоровье");
        System.out.println("3 - Оружие и броня");
        System.out.println("Введите раздел предметов, который хотите выбрать: ");
        switch (itemsList){
            case 1:
                System.out.println("Вы выбрали монеты");
                item.Coins = + 15;
        }

    }
}
