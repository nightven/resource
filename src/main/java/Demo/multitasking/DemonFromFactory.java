package Demo.multitasking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Использование ThreadFactory для создания демонов
public class DemonFromFactory implements Runnable {
    public void run(){
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            System.out.println("Interapted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new DemonsThreadFactory());
        for (int i = 0; i < 10; i++) {
            exec.execute(new DemonFromFactory());
        }
        System.out.println("Все демоны запущены");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
