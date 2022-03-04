package nick.pack;


import java.io.FileNotFoundException;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) throws SocketException, FileNotFoundException {
        method1();
        System.out.println("Main");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element);
        }
    }
    public static void method1() throws SocketException, FileNotFoundException{
        method2();
        System.out.println("Method1: This is checked exception");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element);
        }
    }
    public static void method2() throws FileNotFoundException {
        method3();
        System.out.println("Method2: This is checked exception");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element);
        }
    }
    public static void method3() throws ArithmeticException{
        method4();
        System.out.println("Method3: This is unchecked exception");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element);
        }
    }
    public static void method4() throws IndexOutOfBoundsException{
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println("Method4: This is unchecked exception");
        for (StackTraceElement element : elements){
            System.out.println(element);
        }
    }
}
