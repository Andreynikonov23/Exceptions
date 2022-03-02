package nick.pack;


public class Main {
    /*
    Реализовать метод log.
    Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log),
    а также переданное сообщение.
    Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
     */
    public static void main(String[] args) {
        log();
    }
    public static void log(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getClassName());
        System.out.println(elements[2].getMethodName() + ": " + "In " + elements[2].getMethodName() + " method");
    }
}
