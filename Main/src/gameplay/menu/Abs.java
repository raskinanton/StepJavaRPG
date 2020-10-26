package gameplay.menu;

import item.*;
import monsters.HardMonster;
import monsters.MediumMonster;
import monsters.Monster;
import player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Abs {
    //проверка, что введено число
    public static boolean checkInt(String s) {
        boolean bul = true;
        try {
            Integer.parseInt(s);
        } catch (Exception var3) {
            bul = false;
        }
        return bul;
    }
    // определение номера предмета из списка которым хотят воспользоваться. Переделать в возвращаемый инт
    public int itemToDo(Scanner scn, List<BossItem> itm){
        int it = -1;
        while (true){
            System.out.println("Выберите предмет,введя соответствующую цифру");

            for(int i=0;i<itm.size();i++){
                System.out.println((i+1)+". "+itm.get(i).getName());
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
            System.out.println("выбрали предмет - №"+(it-1));
            System.out.println("-----------------");

        }
        return it-1;
    }


    protected void printMenu(ArrayList<String> ar){
        for(int i = 0;i<ar.size();i++){
            if(i==1 || i==2){
                continue;
            }
            else{
                System.out.println(ar.get(i));
            }

        }
    }

    protected ArrayList<Integer> madePlayer(ArrayList<String> label, Scanner scn){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<label.size();i++){

            while (true){
                System.out.println("Введите "+label.get(i)+", не более 100");
                String param = scn.nextLine();
                if(checkInt(param)){
                    int par = Integer.parseInt(param);
                    if(i==0 || i==3 && par>0 && par<=100){
                        ar.add(par);
                        break;
                    }
                    else if(i!=0 && i!=3 && par>-1 && par<=100){
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

    public void payBack(Player player, Monster monster){
        System.out.println("Оплата за отступление получена. Можешь идти");
    }

    public void healthByCoin(Player player, Scanner scn){
        int maxcoin = player.getSpec().getHpMax()-player.getSpec().getHp();

        while (true){
            System.out.println("У вас "+player.getSpec().getCoins()+" монет.");
            System.out.println("Одна монета - одна единица здоровья");
            System.out.println("Введите число монет, на которые хотите подлечиться. Поднять hp выше максимального" +
                    player.getSpec().getHpMax()+", в этом методе нельзя.");

            String param = scn.nextLine();
            if(checkInt(param)){
                int coin = Integer.parseInt(param);
                if(coin>0 && coin<=player.getSpec().getCoins()){

                    player.getSpec().setHp(player.getSpec().getHp()+coin);

                    if(player.getSpec().getHp()>player.getSpec().getHpMax()){
                        player.getSpec().setHp(player.getSpec().getHpMax());
                    }
                    else{
                        maxcoin = coin;
                    }

                    System.out.println("Лечение игрока выполнено, на "+maxcoin);
                    player.getSpec().setCoins(player.getSpec().getCoins()-maxcoin);
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
    public Monster choiseMonster(Player  player){
        Monster mon = null;
        if(player.getSpec().getArmor()>(player.getSpec().getHp()*40)/100){
            mon = new HardMonster(player);
        }
        else{
            mon = new MediumMonster(player);
        }
        return mon;
    }
    //
}
