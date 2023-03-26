package thread;

public class RunnableDemoApp {
    //
    static final int MAX_COUNT = 100;
    volatile static int count = 0;
    static Object lock = new Object();

    public static void main(String[] args) {
        // Thi's constructor
        Thread player1 = new Player("Player 1");
        Thread player2 = new Player("Player 2");
        player1.start();
        player2.start();

    }
}



