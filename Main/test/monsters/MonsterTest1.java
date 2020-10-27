package monsters;


import org.junit.jupiter.api.Test;
import player.Player;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonsterTest1 {
    @Test
    public void passTest(){
        Monster monster = new Monster("Monster", 100, 100, 60, 10, 5);

//        Player player = new Player("Sasha", 100, 100, 50, 10,5);
        Player player1 = new Player("Sasha", 100, 100, 50, 10,5);

//        var res = monster.pass(player);
        var res1 = monster.pass(player1);
//        assertTrue(res);
        assertFalse(res1);
//        return player.getSpec().getCoins() < spec.getCoins();
    }
}
