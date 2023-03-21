package home5;

class Player extends Thread {
    String name;

    @Override
    public void run() {
        while (RunnableDemoApp.count < RunnableDemoApp.MAX_COUNT) {
            synchronized (RunnableDemoApp.lock) {
                RunnableDemoApp.count++;
            }
        }
    }

    public Player(String name){
        this.name = name;

    }

}
