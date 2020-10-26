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
        this.myhealth = rnd.nextInt(10)+1;
        this.armorPlayer = rnd.nextInt(10)+1;

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
