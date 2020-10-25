package gameplay.menu;

import monsters.Monster;
import player.Player;

import java.util.ArrayList;
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
    protected void printPlayer(Player player){
        System.out.println("Имя игрока - "+player.getSpec().getName());
        System.out.println("Количество hp - "+player.getSpec().getHp());
        System.out.println("Количество монет - "+player.getSpec().getCoins());
        System.out.println("Защита - "+player.getSpec().getArmor());
        System.out.println("Атака - "+player.getSpec().getAttack());

    }
    protected void printMonster(Monster monster){
        System.out.println("Имя монсра - "+monster.getSpec().getName());
        System.out.println("Количество hp - "+monster.getSpec().getHp());
        System.out.println("Количество монет для отступления- "+monster.getSpec().getCoins());
        System.out.println("Защита - "+monster.getSpec().getArmor());
        System.out.println("Атака - "+monster.getSpec().getAttack());

    }
    protected ArrayList<Integer> madePlayer(ArrayList<String> label, Scanner scn){
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
    public boolean war(Player player, Monster monster){
        Random rnd = new Random();
        System.out.println("Игрок победил");
        boolean bul = true;
            for(int i=0;i<10;i++){
                //System.out.println(rnd.nextDouble());
                int first = rnd.nextInt(2);
                System.out.println(first);
                if(first==0){
                    System.out.println("бьет игрок");
                    int rez = monster.getSpec().getHp()-(int)(player.getSpec().getAttack()* rnd.nextDouble());
                    monster.getSpec().setHp(rez);
                    System.out.println("hp монстра - "+monster.getSpec().getHp());
                }
                else{
                    System.out.println("бьет монстр");
                }
            }




        return  bul;
    }
    public void payBack(Player player, Monster monster){
        System.out.println("Оплата за отступление получена. Можешь идти");
    }
}
