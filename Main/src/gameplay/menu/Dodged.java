package gameplay.menu;

import java.util.Random;

public class Dodged implements Runnable{
    private int dod;

    public Dodged(){
        this.dod = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random rnd = new Random();
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()){

            if(dod==0){
                int r = rnd.nextInt(10)*1000+6000;

                try {
                    Thread.sleep(r);
                } catch (InterruptedException e) {
                    current.interrupt();
                    //System.out.println("розбудили и выключили");
                    //e.printStackTrace();
                }
                setDod(1);
//                System.out.println("============");
//                System.out.println("есть 1");
//                System.out.println("============");
            }
        }


    }

    public int getDod() {
        return dod;
    }

    public void setDod(int dod) {
        this.dod = dod;
    }
}
