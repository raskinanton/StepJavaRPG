package gameplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scn = new Scanner(System.in);
    private ArrayList<String> ar = new ArrayList<>();
    //плайер

    public Game(){
        ar.add("Что бы сделать ход, введите - m");
        ar.add("Что бы атаковать, введите - a");
        ar.add("Что бы сделать ход назад, введите - b");
        ar.add("Что бы сделать поправить здоровье, введите - h");
        ar.add("Что бы использовать предмет, введите - t");
        ar.add("Что бы выйти из игры, введите - q");
    }

    public void start(){
        System.out.println("Вы в игре");

        while (true){
            System.out.println("Выберите команду");
            printMenu(ar);
            System.out.println("-------------");
            String s = scn.nextLine();
            if(s.equals("m") || s.equals("a") || s.equals("b") || s.equals("h") || s.equals("t") || s.equals("q")){
                switch (s){
                    case "m":
                        System.out.println("move");
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

}
