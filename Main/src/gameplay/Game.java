package gameplay;

import monsters.Monster;
import player.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scn = new Scanner(System.in);
    private ArrayList<String> ar = new ArrayList<>();
    //плайер
    private Player player;

    public Game(){
        ar.add("Что бы сделать ход, введите - m");
        ar.add("Что бы атаковать, введите - a");
        ar.add("Что бы сделать ход назад, введите - b");
        ar.add("Что бы сделать поправить здоровье, введите - h");
        ar.add("Что бы использовать предмет, введите - t");
        ar.add("Что бы выйти из игры, введите - q");
        player = new Player();
    }

    public void start(){
        System.out.println("Вы в игре");
        while (true){
            System.out.println("параметры игрока: ");
            //player.print();
            //printPlayer(player);
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
}
