package home5;

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




// Нельзя допустить ситуации когда 2 потока одновременно произведут обновление счетсчика, для этого надо заблочить 1 поток и он ждет пока выполниться другой


// Порядок расположения элементов в классе (загуглить)
// Конструкторы, диструкторы, класс


// После создаю поток со своим названием ( Игро1/2 не переменная!) передав в конструктор название поток

