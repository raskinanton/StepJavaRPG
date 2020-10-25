package monsters;

import item.*;
import player.Player;
import player.Specification;

import java.util.*;

public class Monster implements IntMonster {
    private Specification spec;
    private List<BossItem> itemsList = new ArrayList<>();


    public Monster(String name, int hp, int hpMax, int coins, int armor, int attack) {
        this.spec = new Specification(name, hp, hpMax, coins, armor, attack);
    }

    public Specification getSpec() {
        return spec;
    }

    public Monster(){

    }

    public void printMonster(Specification spec) {
        System.out.println("Монстр - " + spec.getName());
        System.out.println("Количество hp - " + spec.getHp());
        System.out.println("Количество монет - " + spec.getCoins());
        System.out.println("Защита - " + spec.getArmor());
        System.out.println("Атака - " + spec.getAttack());
    }

    public void initItem() {

        Map<Integer, BossItem> mapItem = new HashMap<>();
        mapItem.put(1, new Coins("Деньги", 10));
        mapItem.put(2, new Crossbow("Крутой арбалет", 20));
        mapItem.put(3, new HealthBarrel("Бутылка со здоровьем", 20));
        mapItem.put(4, new HauberkArmor("Броня Хауберка", 50));
        mapItem.put(5, new LeatherArmor("Кожанная броня", 15));
        mapItem.put(6, new PlateArmor("Пластинчатая броня", 30));
        mapItem.put(7, new Sword("Меч", 30));

        Random randomNumberCoins = new Random();
        int numberCoins = randomNumberCoins.nextInt(7) + 1;

        itemsList.add(mapItem.get(numberCoins));

    }
    public void initItem2() {
        Random randomNumberCoins = new Random();
        int numberCoins = randomNumberCoins.nextInt(3) + 1;
        for(int i=0;i<numberCoins;i++){
            switch (randomNumberCoins.nextInt(6)){
                case 0:

                    itemsList.add(new Coins("мешок монет"+i,randomNumberCoins.nextInt(15)+3));
                    break;
                case 1:
                    itemsList.add(new Crossbow("арбалет"+i,randomNumberCoins.nextInt(10)+5));
                    break;
                case 2:
                    itemsList.add(new HauberkArmor("кольчуга"+i,randomNumberCoins.nextInt(10)+5));
                    break;
                case 3:
                    itemsList.add(new HealthBarrel("бутылка лекарст"+i,randomNumberCoins.nextInt(20)+3));
                    break;
                case 4:
                    itemsList.add(new LeatherArmor("кожанная броня"+i,randomNumberCoins.nextInt(8)+3));
                    break;
                case 5:
                    itemsList.add(new PlateArmor("латы"+i,randomNumberCoins.nextInt(15)+8));
                    break;
                case 6:
                    itemsList.add(new Sword("мечь"+i,randomNumberCoins.nextInt(8)+8));
                    break;
            }
        }

    }


    @Override
    public boolean attack(Player player) {

//        Specification specPlayer = player.getSpec();
//
//        if (specPlayer.getCoins())

        return true;
    }

    @Override
    public boolean pass(Player player) {
        return player.getSpec().getCoins() < spec.getCoins();
    }
}
