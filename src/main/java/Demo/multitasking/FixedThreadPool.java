package Demo.multitasking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);//задаем количество потоков
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOf());
        }
        exec.shutdown();

    }
}
