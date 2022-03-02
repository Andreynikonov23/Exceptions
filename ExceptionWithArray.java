package nick.pack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            array[8] = 5;
        }
        catch (Exception e){
            array[array.length - 1] = 5;
        }
        System.out.println(Arrays.toString(array));
    }
}
