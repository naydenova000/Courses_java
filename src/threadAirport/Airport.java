package threadAirport;

class Airport extends Thread {
    @Override
    public void run(){
        synchronized (AirportApp.lock){
            while (AirportApp.count < AirportApp.MAX_COUNT_AIRPLANE){
                System.out.println(Thread.currentThread().getName() + " : " + AirportApp.count);
                AirportApp.count++;
            }
        }
    }
}
