package ua.gaponov.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ShowFiveSecond {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void show(){
        scheduler.scheduleAtFixedRate(
                ()->{
                    System.out.println("Пройшло 5 секунд");
                },
                5,
                5,
                TimeUnit.SECONDS);
    }

}
