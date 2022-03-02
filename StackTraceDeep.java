package nick.pack;


public class Main {
    /* Метод должен возвращать результат – глубину её стек-трейса
    Написать метод, который возвращает результат –
    глубину его стек трейса – количество методов в нем
    (количество элементов в списке). Это же число метод должен выводить на экран.
    */
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println("Глубина метода: " + deep);
    }
    public static int getStackTraceDepth(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements){
            System.out.println(element);
        }
        return elements.length - 1;
    }
}
