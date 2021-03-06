package core.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SheduledExecutorsImpl {

    public static void main(String[] args) throws InterruptedException {


//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//
//        Runnable task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(2);
//                System.out.println("Scheduling: " + System.nanoTime());
//            }
//            catch (InterruptedException e) {
//                System.err.println("task interrupted");
//            }
//        };
//
//        executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);




//==========================================================

//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//
//        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
//
//        int initialDelay = 0;
//        int period = 1;
//        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);


        //==========================================================

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
        ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);




    }







}
