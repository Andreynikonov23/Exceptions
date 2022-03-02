package nick.pack;


public class Main {
    /*
    Написать пять методов, которые вызывают друг друга.
    Каждый метод должен возвращать номер строки,
    вызвавшего его, полученное с помощью StackTrace.
     */
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
    }
    public static void method2(){
        method3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[3].getLineNumber());
    }
    public static void method3(){
        method4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
    }
    public static void method4(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
    }
}
