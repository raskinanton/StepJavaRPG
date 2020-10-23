package gameplay.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Abs {

    public static boolean checkInt(String s) {
        boolean bul = true;
        try {
            Integer.parseInt(s);
        } catch (Exception var3) {
            bul = false;
        }
        return bul;
    }
    public void itemToDo(Scanner scn, ArrayList<String> itm){
        int it = -1;
        while (true){
            System.out.println("Выберите предмет,введя соответствующую цифру");
            //player.getListItem().size
            for(int i = 0;i<itm.size();i++){
                System.out.println((i+1)+". "+itm.get(i));
            }
            System.out.println("Если передумали, введите q");
            String itms = scn.nextLine();
            if(itms.equals("q")){
                break;
            }
            if(checkInt(itms)){
                it = Integer.parseInt(itms);
                if(it>0 && it<=itm.size()){
                    break;
                }
                else{
                    System.out.println("Введена команда не соответствующая меню");
                }
            }
            else{
                System.out.println("Введена команда не соответствующая меню");
            }
        }
        if(it!=-1){
            System.out.println("выбрали предмет - "+itm.get(it-1));
            // todo
        }
    }
}
