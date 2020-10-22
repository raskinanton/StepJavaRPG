package monsters;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IntMonster {

    List<String> items = new ArrayList<>();





    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int pass() {
        return 0;
    }
}
