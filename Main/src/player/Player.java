package player;

import item.*;

import item.Coins;

import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractPlayer {
    private Specification spec;
    private List<BossItem> itemsList = new ArrayList();
    private int win = 0;

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
        System.out.println("Число побед - "+getWin());
    }

    public void toUseItem(int i){
        BossItem itm = itemsList.get(i);


       switch (itm.getLabel()){
            case "деньги":
               spec.setCoins(spec.getCoins() + itm.getAll());
                System.out.println("Предмет - "+itm.getName());
               System.out.println("вам были добавлены монеты на "+itm.getAll());
               break;
            case "мечь":
                spec.setAttack(spec.getAttack() + itm.getAll());
                System.out.println("Предмет - "+itm.getName());
                System.out.println("Ваша атака была увеличена на "+itm.getAll());
                break;
           case "арбалет":
               spec.setAttack(spec.getAttack() + itm.getAll());
               System.out.println("Предмет - "+itm.getName());
               System.out.println("Ваша атака была увеличена на "+itm.getAll());
               break;
            case "здоровье":
               spec.setHp(spec.getHp() + itm.getAll());
                System.out.println("Предмет - "+itm.getName());
               System.out.println("Ваше здоровье восстановлено на "+itm.getAll());
               break;
            case "кожа":
                spec.setArmor(spec.getArmor() + itm.getAll());
                System.out.println("Предмет - "+itm.getName());
                System.out.println("Ваша защита повышена на "+itm.getAll());
                break;
           case "кольчуга":
               spec.setArmor(spec.getArmor() + itm.getAll());
               System.out.println("Предмет - "+itm.getName());
               System.out.println("Ваша защита повышена на "+itm.getAll());
               break;
           case "латы":
               spec.setArmor(spec.getArmor() + itm.getAll());
               System.out.println("Предмет - "+itm.getName());
               System.out.println("Ваша защита повышена на "+itm.getAll());
               break;

        }
        itemsList.remove(i);

    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

}
