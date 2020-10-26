package monsters;

import player.Player;

import java.util.Random;

public class HardMonster extends Monster{
    private int myhealth;
    private int armorPlayer;

    public HardMonster(Player player){
        super(player);
        System.out.println("Создан хардмонстр");
        Random rnd = new Random();
        //this.myhealth = rnd.nextInt(10)+1;
        this.myhealth = player.getSpec().getHp()/5;
        this.armorPlayer = rnd.nextInt(player.getSpec().getArmor()/2+1)+player.getSpec().getArmor()/10;

    }

    @Override
    public boolean attack(Player player) {
        boolean bul = true;
        Random rnd = new Random();
        int hpPlayer = player.getSpec().getHp();
        int hpMonster = getSpec().getHp();
        int armorplayernow = player.getSpec().getArmor();


        while (hpPlayer>0 && hpMonster>0){
            if(hpMonster<getSpec().getHp()/5 && myhealth!=0){
                hpMonster = hpMonster+myhealth;
                System.out.println("монстр применил для себя здоровье");
                myhealth=0;
            }
            int first = rnd.nextInt(2);
            if(first==0){
                //
                int atak = (int)(player.getSpec().getAttack()* rnd.nextDouble())+player.getSpec().getAttack()/2;
                if(atak>player.getSpec().getAttack()){
                    atak=player.getSpec().getAttack();
                }
                if((atak - getSpec().getArmor())>0){
                    hpMonster= hpMonster-(atak - getSpec().getArmor());
                }

                System.out.println("бьет игрок на "+atak);
                System.out.println("hp монстра - "+hpMonster);
                System.out.println("------------");
            }
            else{
                switch (rnd.nextInt(2)){
                    case 0:
                        int atak = (int)(getSpec().getAttack()* rnd.nextDouble())+getSpec().getAttack()/3;
                        if(atak>getSpec().getAttack()){
                            atak=getSpec().getAttack();
                        }
                        if((atak - armorplayernow)>0){
                            hpPlayer= hpPlayer-(atak - armorplayernow);
                        }

                        System.out.println("бьет монстр на "+atak);
                        System.out.println("hp игрока - "+hpPlayer);
                        System.out.println("------------");

                        break;
                    case 1:
                        if(armorplayernow!=0){
                            armorplayernow = armorplayernow - armorPlayer;
                            if(armorplayernow<0){
                                armorplayernow = 0;
                            }
                            System.out.println("бьет монстр по броне на "+armorPlayer);
                            System.out.println("armor игрока - "+armorplayernow);
                            System.out.println("------------");
                        }
                        else{
                            int atak2 = (int)(getSpec().getAttack()* rnd.nextDouble())+getSpec().getAttack()/3;
                            if(atak2>getSpec().getAttack()){
                                atak2=getSpec().getAttack();
                            }
                            if((atak2 - armorplayernow)>0){
                                hpPlayer= hpPlayer-(atak2 - armorplayernow);
                            }
                            System.out.println("бьем от брони");
                            System.out.println("бьет монстр на "+atak2);
                            System.out.println("hp игрока - "+hpPlayer);
                            System.out.println("------------");
                        }

                        break;
                }

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(hpMonster>0){
            bul=false;
        }
        else{
            player.getSpec().setHp(hpPlayer);
            player.getSpec().setArmor(armorplayernow);
            initItem2(3);
            player.getItemsList().addAll(super.getItemsList());
        }

        return bul;
    }

    public int getMyhealth() {
        return myhealth;
    }

    public void setMyhealth(int myhealth) {
        this.myhealth = myhealth;
    }

    public int getArmorPlayer() {
        return armorPlayer;
    }

    public void setArmorPlayer(int armorPlayer) {
        this.armorPlayer = armorPlayer;
    }
}
