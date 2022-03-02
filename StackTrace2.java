package nick.pack;


public class Main {
    /*
    Написать пять методов, которые вызывают друг друга.
    Каждый метод должен возвращать имя метода,
    вызвавшего его, полученное с помощью StackTrace.
     */
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
    }
    public static void method2(){
        method3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[3].getMethodName());
    }
    public static void method3(){
        method4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
    }
    public static void method4(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
    }
}
