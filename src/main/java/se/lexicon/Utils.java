package se.lexicon;

public class Utils {
    public static void outLine () {
        System.out.println("---------------------------");
    }

    public static void errorMessage (String message) {
        System.out.println(message);
        Utils.outLine();
    }
}
