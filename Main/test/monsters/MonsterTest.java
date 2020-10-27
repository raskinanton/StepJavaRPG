package monsters;


import org.junit.jupiter.api.Test;
import player.Player;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
    @Test
    public void passTest(){
        Monster monster = new Monster("Monster", 100, 100, 60, 10, 5);

        Player player = new Player("Sasha", 100, 100, 50, 10,5);
//        Player player1 = new Player("Sasha", 100, 100, 50, 10,5);

        var res = monster.pass(player);

        assertTrue(res);

//        return player.getSpec().getCoins() < spec.getCoins();
    }
}
