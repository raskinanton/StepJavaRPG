package gameplay.menu;

import item.*;
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
//    public void initItem2() {
//        Random randomNumberCoins = new Random();
//        int numberCoins = randomNumberCoins.nextInt(4) + 1;
//        for(int i=0;i<numberCoins;i++){
//            switch (randomNumberCoins.nextInt(6)){
//                case 0:
//
//                    itemsList.add(new Coins("мешок монет"+i,randomNumberCoins.nextInt(15)+3));
//                    break;
//                case 1:
//                    itemsList.add(new Crossbow("арбалет"+i,randomNumberCoins.nextInt(10)+5));
//                    break;
//                case 2:
//                    itemsList.add(new HauberkArmor("кольчуга"+i,randomNumberCoins.nextInt(10)+5));
//                    break;
//                case 3:
//                    itemsList.add(new HealthBarrel("бутылка лекарст"+i,randomNumberCoins.nextInt(20)+3));
//                    break;
//                case 4:
//                    itemsList.add(new LeatherArmor("кожанная броня"+i,randomNumberCoins.nextInt(8)+3));
//                    break;
//                case 5:
//                    itemsList.add(new PlateArmor("латы"+i,randomNumberCoins.nextInt(15)+8));
//                    break;
//                case 6:
//                    itemsList.add(new Sword("мечь"+i,randomNumberCoins.nextInt(8)+8));
//                    break;
//            }
//        }
//
//    }

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
}
