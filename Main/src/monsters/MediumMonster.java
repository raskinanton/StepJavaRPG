package monsters;

import player.Player;

public class MediumMonster extends Monster{

    public MediumMonster(Player player){
        super(player);
        System.out.println("Создан МедиумМонстр");

    }

    @Override
    public boolean attack(Player player) {
        return super.attack(player);
    }
}
