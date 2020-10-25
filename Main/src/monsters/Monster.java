package monsters;

import item.*;
import player.Player;
import player.Specification;

import java.util.*;
import java.util.stream.Collectors;

public class Monster implements IntMonster {
    private Specification spec;
    private List<? super BossItem > itemsList = new ArrayList();
//    private int[] itemArray;

    public Monster(String name, int hp, int hpMax, int coins, int armor, int attack){
        this.spec = new Specification(name, hp, hpMax, coins, armor, attack);
        itemsList.add(new Coins("деньги", 10));
        itemsList.add(new Crossbow("крутой арбалет", 20));
        itemsList.add(new HealthBarrel("здоровье", 20));
        itemsList.add(new PlateArmor("Пластинчатая броня", 30));
        itemsList.add(new LeatherArmor("Кожанная броня", 30));
        itemsList.add(new Sword("меч", 30));
    }

    public Specification getSpec() {
        return spec;
    }

    public void initItem() {

        Map<Integer, ? super BossItem> mapItem = new HashMap<>();
        mapItem.put(1, new Coins("деньги", 10));
        mapItem.put(2, new Crossbow("крутой арбалет", 20));
        mapItem.put(3, new HealthBarrel("здоровье", 20));
        mapItem.put(4, new PlateArmor("Пластинчатая броня", 30));
        mapItem.put(5, new LeatherArmor("Кожанная броня", 30));
        mapItem.put(6, new PlateArmor("Пластинчатая броня", 30));
        mapItem.put(7, new Sword("меч", 30));

        Random randomNumberCoins = new Random();
        int numberCoins = randomNumberCoins.nextInt(7) + 1;

//        for (int i = 0; i < numberCoins; i++) {
//            itemsList.add(mapItem.get(i));
//        }





//        for (var entry : mapItem.entrySet()) {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//            itemsList.add(entry.getValue());
//        }

//        Random randomNumberCoins = new Random();
//        int numberCoins = randomNumberCoins.nextInt(7) + 1;

//        for (int i = 0; i < numberCoins; i++) {
////            itemsList.add(mapItem.get(1).);
//        }




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
