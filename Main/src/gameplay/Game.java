package gameplay;

import java.util.Scanner;

public class Game {
    private Scanner scn = new Scanner(System.in);
    //плайер

    public void start(){
        System.out.println("Вы в игре");

        while (true){
            System.out.println("Выберите команду");
            String s = scn.nextLine();
            if(s.equals("m") || s.equals("a") || s.equals("b") || s.equals("h") || s.equals("t") || s.equals("q")){
                switch (s){
                    case "m":
                        System.out.println("move");
                        break;
                    case "a":
                        System.out.println("atak");
                        break;
                    case "b":
                        System.out.println("back");
                        break;
                    case "h":
                        System.out.println("add health");
                        break;
                    case "t":
                        System.out.println(" use thing");
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

}
