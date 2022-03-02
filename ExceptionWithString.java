package nick.pack;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            str = str.toUpperCase(Locale.ROOT);
        }
        catch (Exception e){
            str = "Hello World!";
            str = str.toUpperCase(Locale.ROOT);
        }
        System.out.println(str);
    }
}
