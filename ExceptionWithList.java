package nick.pack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Привет");
        list.add("Hallo");
        list.add("Hola");
        list.add("أهلاً");
        String str = null;
        try {
            str = list.get(18);
        }
        catch (Exception e){
            str = list.get(list.size() -1);
        }
        System.out.println(str);
    }
}
