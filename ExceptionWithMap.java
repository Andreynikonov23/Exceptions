package nick.pack;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = null;
        try {
            map = new HashMap<>(null);
        } catch (Exception e){
            map = new HashMap<>();
        }
        System.out.println(map);
    }
}
