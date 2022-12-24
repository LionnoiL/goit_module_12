package ua.gaponov.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ShowOneSecond {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private  long startTime = System.currentTimeMillis();
    private int secCounter;

    public void show(){
        scheduler.scheduleAtFixedRate(
                ()->{
                    secCounter = (int) (System.currentTimeMillis() - startTime) / 1000;
                    System.out.println("Від старту пройшло " + secCounter + " секунд");
                },
                1,
                1,
                TimeUnit.SECONDS);
    }
}
