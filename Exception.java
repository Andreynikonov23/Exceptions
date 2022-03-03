package nick.pack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /*
    1. Создать статический метод который принимает на вход три параметра:
        login, password и confirmPassword.
    2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
    3. Длина login должна быть меньше 20 символов.
        Если login не соответствует этим требованиям, необходимо выбросить исключение.
    4. Password должен содержать только латинские буквы, цифры и знак подчеркивания.
        Длина password должна быть меньше 20 символов.
        Также password и confirmPassword должны быть равны.
        Если password не соответствует этим требованиям, необходимо выбросить исключение.
    5. Обработка исключений проводится внутри метода.
    6. Метод возвращает true, если значения верны или false в другом случае.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите логин");
        String login = reader.readLine();
        System.out.println("Введите пароль");
        String password = reader.readLine();
        System.out.println("Повторите пароль");
        String confirmPassword = reader.readLine();
        signIn(login, password, confirmPassword);
    }
    public static void signIn(String login, String password, String confirmPassword){
        char[] loginArray = null;
        char[] passwordArray = null;
        char[] confirmPasswordArray = null;
        loginArray = login.toCharArray();
        passwordArray = password.toCharArray();
        confirmPasswordArray = confirmPassword.toCharArray();
        ArrayList<Character> correctChar = new ArrayList<>(check());
        int result = 0;
        for (int i = 0; i < loginArray.length; i++) {
            for (int j = 0; j < correctChar.size(); j++) {
                if (loginArray[i] == correctChar.get(j)){
                    result++;
                }
            }
        }
        if (result < loginArray.length && login.length() > 20){
            try{
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(false);
            }
        } else
            System.out.println(true);
        if (password.length() > 20){
            try{
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(false);
            }
        }
        int resultPass = 0;
        for (int i = 0; i < passwordArray.length; i++) {
            for (int j = 0; j < correctChar.size(); j++) {
                if (passwordArray[i] == correctChar.get(j)){
                    result++;
                }
            }
        }
        if (result < password.length()){
            try{
                throw new Exception();
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println(false);
            }
        }else
            System.out.println(true);
        boolean except = false;
        if (password.length() == confirmPassword.length()){
            for (int i = 0; i < confirmPasswordArray.length; i++) {
                if (confirmPasswordArray[i] != passwordArray[i]){
                    try{
                        throw new Exception();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        System.out.println(false);
                        except = true;
                    }
                }
            }
        } else {
            try{
                throw new Exception();
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println(false);
            }
        }
        if (except == false){
            System.out.println(true);
        }
    }
    public static ArrayList<Character> check(){
        ArrayList<Character> correctChar = new ArrayList<>();
        correctChar.add('Q');
        correctChar.add('q');
        correctChar.add('W');
        correctChar.add('w');
        correctChar.add('E');
        correctChar.add('e');
        correctChar.add('R');
        correctChar.add('r');
        correctChar.add('T');
        correctChar.add('t');
        correctChar.add('Y');
        correctChar.add('y');
        correctChar.add('U');
        correctChar.add('u');
        correctChar.add('I');
        correctChar.add('i');
        correctChar.add('O');
        correctChar.add('o');
        correctChar.add('P');
        correctChar.add('p');
        correctChar.add('A');
        correctChar.add('a');
        correctChar.add('S');
        correctChar.add('s');
        correctChar.add('D');
        correctChar.add('d');
        correctChar.add('F');
        correctChar.add('f');
        correctChar.add('G');
        correctChar.add('g');
        correctChar.add('H');
        correctChar.add('h');
        correctChar.add('J');
        correctChar.add('j');
        correctChar.add('K');
        correctChar.add('k');
        correctChar.add('L');
        correctChar.add('l');
        correctChar.add('Z');
        correctChar.add('z');
        correctChar.add('X');
        correctChar.add('x');
        correctChar.add('C');
        correctChar.add('c');
        correctChar.add('V');
        correctChar.add('v');
        correctChar.add('B');
        correctChar.add('b');
        correctChar.add('N');
        correctChar.add('n');
        correctChar.add('M');
        correctChar.add('m');
        correctChar.add('1');
        correctChar.add('2');
        correctChar.add('3');
        correctChar.add('4');
        correctChar.add('5');
        correctChar.add('6');
        correctChar.add('7');
        correctChar.add('8');
        correctChar.add('9');
        correctChar.add('_');
        return correctChar;
    }
}
