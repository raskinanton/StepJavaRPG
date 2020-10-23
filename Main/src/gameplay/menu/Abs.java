package gameplay.menu;

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
}
