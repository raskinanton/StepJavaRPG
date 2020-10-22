import gameplay.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ex =-1;
        System.out.println("Hello comrades!!");
        Game game = new Game();
        while (true){
            System.out.println("Введите 1 для начала игры или 0 для выхода");
            String s = scn.nextLine();
            if(checkInt(s)){
                if(Integer.parseInt(s)==0){
                    ex=0;
                    break;
                }
                if(Integer.parseInt(s)==1){
                    game.start();
                    break;
                }
                else{
                    System.out.println("Введено не соответствующее число");
                }
            }
            else{
                System.out.println("Введено не число. Повторите");
            }

        }

    }
    private static boolean checkInt(String s){
        boolean bul = true;
        try{
            Integer.parseInt(s);
        }catch (Exception e){
            bul = false;
        }
        return bul;
    }
}
