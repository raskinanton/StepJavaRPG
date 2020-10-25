package player;

import item.*;

import item.Coins;

import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractPlayer {
    private Specification spec;
    private List<BossItem> itemsList = new ArrayList();

    public Player(String name, int hp, int hpMax, int coins, int armor, int attack){
        this.spec = new Specification(name, hp, hpMax,coins,armor, attack);
        itemsList.add(new Coins("деньги", 10));
        itemsList.add(new Crossbow("крутой арбалет", 20));
        itemsList.add( new HealthBarrel("здоровье", 20));
        itemsList.add( new PlateArmor("Кожанная броня", 30));
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
        BossItem itm = itemsList.get(i);


       switch (itm.getName()){
            case "деньги":
               spec.setCoins(spec.getCoins() + itm.getAll());
               System.out.println("вам были добавлены монеты");
               break;
            case "арбалет":
                spec.setAttack(spec.getAttack() + itm.getAll());
                System.out.println("Ваша атака была увеличена на 20 единиц");
                break;
            case "меч":
                spec.setAttack(spec.getAttack() + itm.getAll());
                System.out.println("Ваша атака была увеличена на 30 единиц");
                break;
            case "здоровье":
               spec.setHp(spec.getHp() + itm.getAll());
               System.out.println("Ваше здоровье восстановлено на 20 единиц");
               break;
            case "броня":
                System.out.println("Выберите тип который хотите: Пластинчатая|| Кожанная");
                case "пластинчатая":
                    spec.setArmor(spec.getArmor() + itm.getAll());
                    System.out.println("Ваша защита повышена на 30 единиц");
                    break;
                case "кожанная":
                    spec.setArmor(spec.getArmor() + itm.getAll());
                    System.out.println("Ваша защита была повышена на 30 единиц");
                    break;
        }
        System.out.println("предмет номер "+i);
        System.out.println(itemsList.get(i));
    }
}
