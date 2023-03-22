package home5;

class Player extends Thread {
    String name;

    @Override
    public void run() {
        while (RunnableDemoApp.count < RunnableDemoApp.MAX_COUNT) {
            // Если использует 1 поток метод, 2ой поток заблокирован
            synchronized (RunnableDemoApp.lock) {
                RunnableDemoApp.count++;
            }
        }
    }

    public Player(String name){
        this.name = name;

    }

}
