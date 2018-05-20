package Demo.multitasking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EventChecker(IntGenerator g, int ident){
        generator = g;
        id = ident;
    }
    public void run(){
        while (!generator.isCanceled()){
            int val = generator.next();
            if(val%2 != 0){
                System.out.println(val + " не четно");
                generator.cencel(); //отменa всех EventChecker
            }
        }
    }
    //тестирование произвольного типа IntGenerator
    public static void test(IntGenerator gp, int count){
        System.out.println("Нажмите Control-C l для завершения программы");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++)
            executorService.execute(new EventChecker(gp, i));
            executorService.shutdown();

    }
public static void test(IntGenerator gp){
        test(gp,10);
}
}
