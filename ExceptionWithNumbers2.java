package nick.pack;


public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = Integer.parseInt("XYZ");
        } catch (Exception e){
            a = 656667;
        }
        System.out.println(a);
    }
}
