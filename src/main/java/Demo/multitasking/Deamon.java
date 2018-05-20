package Demo.multitasking;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;
//ЗАПОМНИ, ПОТОКИ ДЕМОНЫ НЕ ЗАВЕРЩАЮТ СЕКЦИЮ finaly !!!!!!!!!!!!!!
//Потоки порождаемые Демонами тоже являються  демонами
public class Deamon implements  Runnable {
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DeamonSpawn());
            System.out.println("DeamonSpawn " + i + " started. ");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "].isDeamon() = " + t[i].isDaemon() + ",");


        }
        while (true)
        Thread.yield();
    }
    public class DeamonSpawn implements Runnable{
        @Override
        public void run() {
            while (true)
                Thread.yield();
        }
    }
    public static class Deamons{
        public static void main(String[] args) {
        Thread d = new Thread(new Deamon());
        d.setDaemon(true);
        d.start();
            System.out.println("d.isDeamon" + d.isDaemon()+ ", ");
            //Даем потокам-демонам завершить процес запуска
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
