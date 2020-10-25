package monsters;

import player.Player;

public interface IntMonster {

    boolean attack(Player player, Monster monster);
    boolean pass(Player player, Monster monster);



}
