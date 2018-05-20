package Demo.multitasking;
//Вызов sleep()  для приостановки потока

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOf{
    public void run(){
    try {
        while (coutDown-- > 0){
            System.out.println(status());
            //Старый стиль
            //Thread.sleep();
            //Стиль Java SE 5/6
                TimeUnit.SECONDS.sleep(1);

        }
    }catch (InterruptedException e){
        System.out.println("Interapted");
    }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
