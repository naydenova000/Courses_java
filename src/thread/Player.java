package thread;

class Player extends Thread {

    @Override
    public void run() {
        while (RunnableDemoApp.count < RunnableDemoApp.MAX_COUNT) {
            synchronized (RunnableDemoApp.lock) {
                try {
                    RunnableDemoApp.count++;
                    doSomething();
                } catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void doSomething() throws InterruptedException {
        notify();
        System.out.println(Thread.currentThread().getName() + ": I'm late " + RunnableDemoApp.count);
        wait();
        System.out.println(Thread.currentThread().getName() + ": I'm winner " + RunnableDemoApp.count);
    }

    public Player(String name){
        super(name);

    }
}
