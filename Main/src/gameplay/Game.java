package gameplay;

import gameplay.menu.Abs;
import monsters.Monster;
import player.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game extends Abs {
    private Scanner scn = new Scanner(System.in);
    private ArrayList<String> ar = new ArrayList<>();
    private ArrayList<String> label = new ArrayList(Arrays.asList( "maxhp", "coins", "armor"));
    //плайер
    private Player player;

    public Game(){
        ar.add("Что бы сделать ход, введите - m");
        ar.add("Что бы атаковать, введите - a");
        ar.add("Что бы сделать ход назад, введите - b");
        ar.add("Что бы сделать поправить здоровье, введите - h");
        ar.add("Что бы использовать предмет, введите - t");
        ar.add("Что бы выйти из игры, введите - q");
        System.out.println("введите имя игрока");
        String name = scn.nextLine();
        ArrayList<Integer> ar = madePlayer();

        player = new Player(name, ar.get(0), ar.get(0), ar.get(1), ar.get(2));
        //player = new Player("игрок1", 20, 20, 0, 10);
    }

    public void start(){
        System.out.println("Вы в игре");
        while (true){
            System.out.println("параметры игрока: ");
            //player.print();
            printPlayer(player);
            System.out.println("--------------");
            System.out.println("Выберите дальнейшую команду");
            printMenu(ar);
            System.out.println("-------------");
            String s = scn.nextLine();
            if(s.equals("m") || s.equals("a") || s.equals("b") || s.equals("h") || s.equals("t") || s.equals("q")){
                switch (s){
                    case "m":
                        System.out.println("move");
                        //
                        Monster monster = new Monster("name", 10, 10, 10);
                        System.out.println("-------------");
                        break;
                    case "a":
                        System.out.println("atak");
                        System.out.println("-------------");
                        break;
                    case "b":
                        System.out.println("back");
                        System.out.println("-------------");
                        break;
                    case "h":
                        System.out.println("add health");
                        System.out.println("-------------");
                        break;
                    case "t":
                        System.out.println(" use thing");
                        System.out.println("-------------");
                        break;
                }
                if(s.equals("q")){
                    System.out.println("Выход из игры");
                    break;
                }
            }
            else{
                System.out.println("Введена команда не соответствующая меню");
            }
        }
    }
    private void printMenu(ArrayList<String> ar){
        for(String s:ar){
            System.out.println(s);
        }
    }
    private void printPlayer(Player player){
        System.out.println("Имя игрока - "+player.getSpec().getName());
        System.out.println("Количество hp - "+player.getSpec().getHp());
        System.out.println("Количество монет - "+player.getSpec().getCoins());
        System.out.println("Защита - "+player.getSpec().getArmor());

    }
    private ArrayList<Integer> madePlayer(){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<label.size();i++){

                while (true){
                    System.out.println("Введите "+label.get(i));
                    String param = scn.nextLine();
                    if(checkInt(param)){
                        int par = Integer.parseInt(param);
                        if(i==0 && par>0){
                            ar.add(par);
                            break;
                        }
                        else if(i>0 && par>-1){
                            ar.add(par);
                            break;
                        }

                        else{
                            System.out.println("Вы ввели не подходящее число. Повторите");
                        }
                    }
                    else{
                        System.out.println("Вы ввели не соответствующее значение. Повторите");
                    }
                }

            }

        return ar;
    }

}
