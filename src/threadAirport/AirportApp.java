package threadAirport;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AirportApp {
    static final int MAX_COUNT_AIRPLANE = 10;
    static final int MAX_LINE = 5;

    volatile static int count = 0;

    static Object lock = new Object();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_LINE);
        for (int i = 0; i < MAX_LINE; i++) {
            executorService.submit(new Airport());
        }
        executorService.shutdown();
    }

}

