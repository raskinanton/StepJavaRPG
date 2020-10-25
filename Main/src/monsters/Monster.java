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
        mapItem.put(1, new Coins("деньги", 10));
        mapItem.put(2, new Crossbow("крутой арбалет", 20));
        mapItem.put(3, new HealthBarrel("здоровье", 20));
        mapItem.put(4, new PlateArmor("Пластинчатая броня", 30));
        mapItem.put(5, new LeatherArmor("Кожанная броня", 30));
        mapItem.put(6, new PlateArmor("Пластинчатая броня", 30));
        mapItem.put(7, new Sword("меч", 30));

        Random randomNumberCoins = new Random();
        int numberCoins = randomNumberCoins.nextInt(7) + 1;

        itemsList.add(mapItem.get(1));

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
