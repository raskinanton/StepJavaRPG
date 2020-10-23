import gameplay.Game;
import gameplay.menu.Abs;

import java.util.Scanner;

public class Main extends Abs {
    public static void main(String[] args) {

        System.out.println("Hello comrades!!");
        Scanner scn = new Scanner(System.in);

            while(true) {
                System.out.println("Введите 1 для начала игры или 0 для выхода");
                String s = scn.nextLine();
                if (checkInt(s)) {
                    if (Integer.parseInt(s) == 0) {
                        break;
                    }
                    if (Integer.parseInt(s) == 1) {
                        Game game = new Game();
                        game.start();
                        break;
                    }
                    System.out.println("Введено не соответствующее число");
                } else {
                    System.out.println("Введено не число. Повторите");
                }
            }

    }

}
