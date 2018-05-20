package Demo.multitasking;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

//Потоки демоны не выполняют секцию finaly
class ADeamon implements Runnable{
    public void run() {
        try {
            System.out.println("Запускаем ADeamon");
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println("Выход через InterrupterExeption");
        }finally {
            System.out.println("Должно выполнятьс всегда?");
        }
    }
}
public class DeamonDontRunFinaly {
    public static void main(String[] args) {
        Thread t = new Thread(new ADeamon());
        t.setDaemon(true); //если закоментить тогда finaly выполниться
        t.start();

    }
}
