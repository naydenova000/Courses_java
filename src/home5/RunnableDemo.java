package home5;

class RunnableDemo implements Runnable {
    public  Thread t;
    public String threadName;

    RunnableDemo (String name) {
        threadName = name;
        System.out.println("Сздание " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Выполнение " +  threadName );

        for(int i = 0; i > 100; i++) {
                System.out.println("I'm winner!");
//                Thread.sleep();
            }
//        } catch (InterruptedException e) {
//            System.out.println("Поток " +  threadName + " прерван.");
//        }
        System.out.println("I'm late...");
    }

    public void start () {
        System.out.println("Запуск " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

