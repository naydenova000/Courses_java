package home5;

public class Main {
    public static void main(String[] args) {
        RunnableDemo runFirst = new RunnableDemo("Поток - 1");
        runFirst.start();

        RunnableDemo runSecond = new RunnableDemo("Поток - 2");
        runSecond.start();
    }
}
