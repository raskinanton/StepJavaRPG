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
    private ArrayList<String> label = new ArrayList(Arrays.asList( "maxhp", "coins", "armor", "attack"));
    //вспомогательно поле на время отсутствия в игроке списка предметов
    private ArrayList<String> itm = new ArrayList<>(Arrays.asList("монеты", "арбалет", "кольчуга", "бочка здоровья",
            "мечь"));
    //плайер
    private Player player;
    //private Monster monster = new Monster();
    private boolean bulplay = true;

    public Game(){
        ar.add("Что бы сделать ход, введите - m");
        ar.add("Что бы атаковать, введите - a");
        ar.add("Что бы сделать ход назад, введите - b");
        ar.add("Что бы сделать поправить здоровье, введите - h");
        ar.add("Что бы использовать предмет, введите - t");
        ar.add("Что бы выйти из игры, введите - q");
        //инициализируем игрока
        System.out.println("введите имя игрока");
        String name = scn.nextLine();
        ArrayList<Integer> ar = madePlayer(label, scn);
        player = new Player(name, ar.get(0), ar.get(0), ar.get(1), ar.get(2), ar.get(3));
        }

    public void run(){
        System.out.println("Вы в игре");
        while (true){
            System.out.println("параметры игрока: ");
            //player.print();
            //выводим статистические данны игрока собственным методом. Лучше сделать в игроке метод
            printPlayer(player);
            player.printPlayer(player.getSpec());
            System.out.println("--------------");
            System.out.println("Выберите дальнейшую команду");
            //выводим меню возможных действий игрока
            // и предлагаем сделать выбор действия
            printMenu(ar);
            System.out.println("-------------");
            String s = scn.nextLine();
            if(s.equals("m") || s.equals("a") || s.equals("b") || s.equals("h") || s.equals("t") || s.equals("q")){
                switch (s){
                    //ход, после которго появится монстр. Делаем инициализацию монстра
                    case "m":
                        System.out.println("move");
                        //как вариант. По расчету данных игрока создаем монстра с соответствующими параметрами
                        // Это образец
                        System.out.println("параметры монстра: ");
                        //Monster mon = monster.madeMonster(0);
//                        Monster monster = new Monster(player.getSpec().getHp()*player.getSpec().getAttack());
//                        printMonstr(monster);
                        //printMonstr(mon);
                        System.out.println("-------------");
                        String ss = "";
                            while (true){
                                System.out.println(ar.get(1));
                                System.out.println(ar.get(2));
                                 ss = scn.nextLine();
                                if(ss.equals("a") || ss.equals("b")){
                                    break;
                                }
                                else{
                                    System.out.println("Вы ввели не существующую команду. Повторите");
                                }
                            }
                        switch (ss){
                            case "a":
                                // проводим атаку монстра. Рандомно кто первый бьет и каждый следующий удар, рандомно сила атаки
                                //
                                System.out.println("atak");

                                //проверка результата боя. Если игрок проиграл, придет false, if сработает, и после switch
                                // сработает проверка на завершение игры по проигрышу
//                        if(!monster.attack(player)){
//                            bulplay = false;
//                        }
//                                if(!war(player, monster)){
//                                    bulplay = false;
//                                }
                                System.out.println("-------------");
                                break;
                            case "b":
                                // отступление, за деньги, которые надо отдать монстру
                                System.out.println("back");
//                                payBack(player, monster);
                                System.out.println("-------------");
                                break;
                        }

                        System.out.println("-------------");
                        break;
//                    case "a":
//                        // проводим атаку монстра. Рандомно кто первый бьет и каждый следующий удар, рандомно сила атаки
//                        //
//                        System.out.println("atak");
//                        //проверка результата боя. Если игрок проиграл, придет false, if сработает, и после switch
//                        // сработает проверка на завершение игры по проигрышу
////                        if(!monster.attack(player)){
////                            bulplay = false;
////                        }
//                        System.out.println("-------------");
//                        break;
//                    case "b":
//                        // отступление, за деньги, которые надо отдать монстру
//                        System.out.println("back");
//                        System.out.println("-------------");
//                        break;
                    case "h":
                        //Лечение
                        System.out.println("add health");
                        System.out.println("-------------");
                        break;
                    case "t":
                        //использование подобраных предметов в случае победы. Пересекается с монетами и лечением.
                        // Надо уточнить
                        System.out.println(" use thing");
                        //int numberItem = itemToDo(scn, player.getItems);
                        //player.itemDo(number);
                        //в методе по номеру item из списка, по его имени кейсами определяется что делать(увеличить
                        // монет, защиту, и т.д.)
                        itemToDo(scn,itm);

                        System.out.println("-------------");
                        break;
                }
                if(!bulplay){
                    System.out.println("Выход из игры");
                    System.out.println("Игрок погиб. Вы проиграли");
                    //printPlayer(player);
                    player.printPlayer(player.getSpec());
                    break;
                }
                if(s.equals("q")){
                    System.out.println("Выход из игры");
                    //printPlayer(player);
                    player.printPlayer(player.getSpec());
                    break;
                }
            }
            else{
                System.out.println("Введена команда не соответствующая меню");
            }
        }
    }

}
