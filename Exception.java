package nick.pack;


public class Main {
    public static void main(String[] args) {
        try {
            int a = 42 /0;
        }
        catch (Exception e){
            System.out.println("На ноль делить нельзя!!! Ты что дурак?!");
        }
    }
}
