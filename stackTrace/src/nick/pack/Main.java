package nick.pack;


public class Main {
    public static void main(String[] args) {
        method1();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement str : elements){
            System.out.println(str);
        }
    }
    public static void method1(){
        method2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement str : elements){
            System.out.println(str);
        }
    }
    public static void method2(){
        method3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement str : elements){
            System.out.println(str);
        }
    }
    public static void method3(){
        method4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement str : elements){
            System.out.println(str);
        }
    }
    public static void method4(){
        System.out.println("Hello World");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement str : elements){
            System.out.println(str);
        }
    }
}
